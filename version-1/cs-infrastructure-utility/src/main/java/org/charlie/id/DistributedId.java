package org.charlie.id;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

/**
 * 分布式ID
 *
 * @author Charlie-6327
 * @date 2022/12/28
 */
public class DistributedId {

    private static final DistributedId INSTANCE = new DistributedId();

    public String getFastSimpleUuid() {
        return IdUtil.fastSimpleUUID();
    }

    public Snowflake getSnowflake(long workerId, long dataCenterId) {
        return IdUtil.getSnowflake(workerId, dataCenterId);
    }

    public static DistributedId getDistributedId() {
        return INSTANCE;
    }
}
