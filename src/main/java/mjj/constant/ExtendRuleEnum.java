package mjj.constant;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: majianjiong
 * @Date: 2023-02-02 15:35
 * @Version: 1.0.0
 **/
public enum ExtendRuleEnum {
    START_3B("3B", Arrays.asList("27B0","27B1")),
    START_3C("3C",Arrays.asList("27C0","27C1")),
    START_3D("3D",Arrays.asList("27D0","27D1")),
    START_3E("3E",Arrays.asList("27E0","27E1")),
    START_3F("3F",Arrays.asList("27F0","27F1")),
    START_3H("3H",Arrays.asList("27H0","27H1")),
    START_3J("3J",Arrays.asList("27J0","27J1")),
    START_3K("3K",Arrays.asList("27K0","27K1")),
    START_3L("3L",Arrays.asList("27L0","27L1")),
    START_3M("3M",Arrays.asList("27M0","27M1")),
    START_3Q("3Q",Arrays.asList("27Q0","27Q1")),
    START_3R("3R",Arrays.asList("27R0","27R1")),
    START_3S("3S",Arrays.asList("27S0","27S1")),
    START_3T("3T",Arrays.asList("27T0","27T1")),
    START_3X("3X",Arrays.asList("27X0","27X1")),
    START_3Y("3Y",Arrays.asList("27Y0","27Y1")),
    START_3Z("3Z",Arrays.asList("27Z0","27Z1"));

    private String deptCode;
    private List<String> companyCode;

    ExtendRuleEnum(String deptCode, List<String> companyCode) {
        this.deptCode = deptCode;
        this.companyCode = companyCode;
    }

    public String getDeptCode() {
        return deptCode;
    }
    public List<String> getCompanyCode() {
        return companyCode;
    }


    public static List<String> getCompanyCodes(String deptCode){
        if(StringUtils.isEmpty(deptCode)){
            return Lists.newArrayList();
        }
        String substring = StringUtils.substring(deptCode, 0, 2);
        for (ExtendRuleEnum value : values()) {
            if(value.getDeptCode().equals(substring)){
                return value.getCompanyCode();
            }
        }
        return Lists.newArrayList();
    }

    public static List<String> getCompanyCodes() {
        List<String> collect = Arrays.stream(values()).flatMap(a -> a.companyCode.stream()).collect(Collectors.toList());
        return collect;
    }
}
