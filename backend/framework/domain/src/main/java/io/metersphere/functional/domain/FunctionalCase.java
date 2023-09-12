package io.metersphere.functional.domain;

import io.metersphere.validation.groups.*;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import lombok.Data;

@Data
public class FunctionalCase implements Serializable {
    @Schema(description =  "ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{functional_case.id.not_blank}", groups = {Updated.class})
    @Size(min = 1, max = 50, message = "{functional_case.id.length_range}", groups = {Created.class, Updated.class})
    private String id;

    @Schema(description =  "业务ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "{functional_case.num.not_blank}", groups = {Created.class})
    private Integer num;

    @Schema(description =  "自定义业务ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{functional_case.custom_num.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 64, message = "{functional_case.custom_num.length_range}", groups = {Created.class, Updated.class})
    private String customNum;

    @Schema(description =  "模块ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{functional_case.module_id.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 50, message = "{functional_case.module_id.length_range}", groups = {Created.class, Updated.class})
    private String moduleId;

    @Schema(description =  "项目ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{functional_case.project_id.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 50, message = "{functional_case.project_id.length_range}", groups = {Created.class, Updated.class})
    private String projectId;

    @Schema(description =  "名称", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{functional_case.name.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 255, message = "{functional_case.name.length_range}", groups = {Created.class, Updated.class})
    private String name;

    @Schema(description =  "评审状态：未开始/进行中/已完成/已结束", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{functional_case.review_status.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 64, message = "{functional_case.review_status.length_range}", groups = {Created.class, Updated.class})
    private String reviewStatus;

    @Schema(description =  "标签（JSON)")
    private String tags;

    @Schema(description =  "编辑模式：步骤模式/文本模式", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{functional_case.step_model.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 50, message = "{functional_case.step_model.length_range}", groups = {Created.class, Updated.class})
    private String stepModel;

    @Schema(description =  "自定义排序，间隔5000", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "{functional_case.pos.not_blank}", groups = {Created.class})
    private Long pos;

    @Schema(description =  "版本ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{functional_case.version_id.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 50, message = "{functional_case.version_id.length_range}", groups = {Created.class, Updated.class})
    private String versionId;

    @Schema(description =  "指向初始版本ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{functional_case.ref_id.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 50, message = "{functional_case.ref_id.length_range}", groups = {Created.class, Updated.class})
    private String refId;

    @Schema(description =  "最近的执行结果：未执行/通过/失败/阻塞/跳过", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "{functional_case.last_execute_result.not_blank}", groups = {Created.class})
    @Size(min = 1, max = 64, message = "{functional_case.last_execute_result.length_range}", groups = {Created.class, Updated.class})
    private String lastExecuteResult;

    @Schema(description =  "是否在回收站：0-否，1-是", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "{functional_case.deleted.not_blank}", groups = {Created.class})
    private Boolean deleted;

    @Schema(description =  "是否是公共用例：0-否，1-是", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "{functional_case.public_case.not_blank}", groups = {Created.class})
    private Boolean publicCase;

    @Schema(description =  "是否为最新版本：0-否，1-是", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "{functional_case.latest.not_blank}", groups = {Created.class})
    private Boolean latest;

    @Schema(description =  "创建人")
    private String createUser;

    @Schema(description =  "删除人")
    private String deleteUser;

    @Schema(description =  "创建时间")
    private Long createTime;

    @Schema(description =  "更新时间")
    private Long updateTime;

    @Schema(description =  "删除时间")
    private Long deleteTime;

    private static final long serialVersionUID = 1L;
}