package org.paasta.caas.dashboard.common.model;

import lombok.Data;

import java.util.Map;

/**
 * Common Resource Requirement Model 클래스
 *
 * @author Hyungu Cho
 * @version 1.0
 * @since 2018.08.16
 */
@Data
public class CommonResourceRequirement {
    // TODO :: USE MODEL
    private Map<String, String> limits;
    private Map<String, String> requests;
}
