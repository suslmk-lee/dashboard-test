package org.paasta.caas.dashboard.workloads.pods;

import lombok.Data;

import java.util.List;

/**
 * Pods List Model 클래스
 *
 * @author Hyungu Cho
 * @version 1.0
 * @since 2018.8.13
 */
@Data
public class PodsList {
    private String resultCode;
    private String resultMessage;

    private List<Pods> items;

    private String selector;
    private String serviceName;
}
