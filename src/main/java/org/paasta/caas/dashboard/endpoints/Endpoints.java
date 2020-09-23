package org.paasta.caas.dashboard.endpoints;

import lombok.Data;
import org.paasta.caas.dashboard.common.model.CommonMetaData;
import org.paasta.caas.dashboard.common.model.CommonSpec;
import org.paasta.caas.dashboard.common.model.CommonStatus;
import org.paasta.caas.dashboard.common.model.CommonSubset;

import java.util.List;

/**
 * Endpoints Model 클래스
 *
 * @author REX
 * @version 1.0
 * @since 2018.08.13
 */
@Data
public class Endpoints {

    private String resultCode;
    private String resultMessage;

    private CommonMetaData metadata;
    private CommonSpec spec;
    private CommonStatus status;
    private List<CommonSubset> subsets;

    // FOR DASHBOARD
    private String serviceName;

}
