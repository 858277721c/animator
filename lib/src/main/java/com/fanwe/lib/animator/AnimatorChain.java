package com.fanwe.lib.animator;

import android.animation.AnimatorSet;
import android.view.View;

/**
 * 动画链条
 */
public interface AnimatorChain
{
    /**
     * 生成一个新动画和上一个动画同时执行
     *
     * @return
     */
    FNodeAnimator with();

    /**
     * 生成一个新动画和上一个动画同时执行
     *
     * @param target 新动画要执行的View对象，如果为null，则沿用上一个动画的View对象
     * @return
     */
    FNodeAnimator with(View target);

    /**
     * 在{@link #with()}方法的基础上会保留上一个动画的参数设置
     *
     * @return
     */
    FNodeAnimator withClone();

    /**
     * 生成一个新动画在上一个动画执行完成后执行
     *
     * @return
     */
    FNodeAnimator next();

    /**
     * 生成一个新动画在上一个动画执行完成后执行
     *
     * @param target 新动画要执行的View对象，如果为null，则沿用上一个动画的View对象
     * @return
     */
    FNodeAnimator next(View target);

    /**
     * 生成一个延迟动画在上一个动画执行完成后执行
     *
     * @param time 延迟多少毫秒
     * @return
     */
    FNodeAnimator delay(long time);

    /**
     * 转为{@link AnimatorSet}
     *
     * @return
     */
    AnimatorSet toAnimatorSet();

    /**
     * 开始动画
     */
    void start();

    /**
     * 对target截图然后设置给ImageView，让ImageView镜像在android.R.id.content的FrameLayout里面执行动画
     */
    void startAsPop();

    /**
     * 动画是否处于运行中
     *
     * @return
     */
    boolean isRunning();

    /**
     * 动画是否已经被启动
     *
     * @return
     */
    boolean isStarted();

    /**
     * 取消动画
     */
    void cancel();
}
