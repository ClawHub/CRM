package com.clawhub.crm.concurrent;

import java.util.concurrent.Semaphore;

/**
 * <Description>可变许可证<br>
 *
 * @author LiZhiming<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019-01-14 16:33 <br>
 */
public class AdjustableSemaphore {
    /**
     * The Semaphore.
     */
    private final ResizeableSemaphore semaphore = new ResizeableSemaphore();

    /**
     * 最大许可证数
     */
    private int maxPermits = 0;

    /**
     * Instantiates a new Adjustable semaphore.
     */
    public AdjustableSemaphore() {
    }

    /**
     * 设置最大许可证数
     *
     * @param newMax 最大许可证数
     */
    public synchronized void setMaxPermits(int newMax) {
        if (newMax < 1) {
            throw new IllegalArgumentException("Semaphore size must be at least 1, was：" + newMax);
        }

        int delta = newMax - this.maxPermits;

        if (delta == 0) {
            return;
        } else if (delta > 0) {
            //多释放几次，就可以达到信号量动态增加的效果了
            this.semaphore.release(delta);
        } else {
            delta *= -1;
            //减少信号量
            this.semaphore.reducePermits(delta);
        }

        this.maxPermits = newMax;

    }

    /**
     * 获取当前可用的许可证数量
     *
     * @return 当前可用的许可证数量
     */
    public int availablePermits() {
        return this.semaphore.availablePermits();
    }

    /**
     * 释放1个许可证
     */
    public void release() {
        this.semaphore.release();
    }

    /**
     * 当前线程尝试去获取1个许可证。
     * <p>
     * 此过程是非阻塞的，它只是在方法调用时进行一次尝试。
     * <p>
     * 如果当前线程获取了1个可用的许可证，则会停止等待，继续执行，并返回true。
     * <p>
     * 如果当前线程没有获得这个许可证，也会停止等待，继续执行，并返回false。
     *
     * @return the boolean
     */
    public boolean tryAcquire() {
        return this.semaphore.tryAcquire();
    }


    /**
     * <Description> 可调节信号量 <br>
     *
     * @author LiZhiming<br>
     * @version 1.0<br>
     * @taskId <br>
     * @CreateDate 2019 -01-14 16:36 <br>
     */
    private static final class ResizeableSemaphore extends Semaphore {

        /**
         * Instantiates a new Resizeable semaphore.
         */
        ResizeableSemaphore() {
            super(0);
        }

        /**
         * 减少许可证
         *
         * @param reduction 减少许可证的数量
         */
        @Override
        protected void reducePermits(int reduction) {
            super.reducePermits(reduction);
        }

    }

}
