package org.paasta.caas.dashboard.common.model;

import lombok.Data;

/**
 * Common Condition Model 클래스
 *
 * @author REX
 * @author Hyungu Cho
 * @version 1.0
 * @since 2018.08.13
 */
@Data
public class CommonCondition {
    private String type;
    private String status;

    private String message;
    private String reason;

    private String lastHeartbeatTime;
    private String lastTransitionTime;
}
