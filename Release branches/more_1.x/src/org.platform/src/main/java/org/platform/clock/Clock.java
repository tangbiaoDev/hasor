/*
 * Copyright 2008-2009 the original author or authors.
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
package org.platform.clock;
/***
 * 
 * @version : 2013-4-27
 * @author 赵永春 (zyc@byshell.org)
 */
public class Clock {
    /**从时钟服务中获取一个在分布式部署环境里有效的时间（尚未实现）。*/
    public static long getSyncTime() {
        return System.currentTimeMillis();
    }
    /**从本地时钟获取一个时间。*/
    public static long getLocalTime() {
        return System.currentTimeMillis();
    }
}