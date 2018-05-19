/*
 * Copyright (C) 2017 zhengjun, fanwe (http://www.fanwe.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fanwe.lib.animator;

/**
 * 链条节点动画，可以在链条{@link AnimatorChain}上一起执行，也可以单独执行
 */
public interface NodeAnimator extends SimplePropertyAnimator<NodeAnimator>
{
    /**
     * 返回节点类型{@link Type}
     *
     * @return
     */
    int getType();

    /**
     * 返回动画链条{@link AnimatorChain}
     *
     * @return
     */
    AnimatorChain chain();

    /**
     * 节点类型
     */
    final class Type
    {
        public static final int HEAD = 0;
        public static final int WITH = 1;
        public static final int NEXT = 2;
        public static final int DELAY = 3;
    }
}