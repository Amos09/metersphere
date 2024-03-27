export const UpdateModuleUrl = '/api/scenario/module/update'; // 更新模块
export const GetModuleTreeUrl = '/api/scenario/module/tree'; // 查找模块
export const MoveModuleUrl = '/api/scenario/module/move'; // 移动模块
export const GetModuleCountUrl = '/api/scenario/module/count'; // 获取模块统计数量
export const AddModuleUrl = '/api/scenario/module/add'; // 添加模块
export const DeleteModuleUrl = '/api/scenario/module/delete'; // 删除模块
export const ScenarioPageUrl = '/api/scenario/page'; // 接口场景列表
export const AddScenarioUrl = '/api/scenario/add'; // 添加接口场景
export const GetScenarioUrl = '/api/scenario/get'; // 获取接口场景详情
export const GetScenarioStepUrl = '/api/scenario/step/get'; // 获取接口场景步骤详情
export const UpdateScenarioUrl = '/api/scenario/update'; // 更新接口场景
export const RecycleScenarioUrl = '/api/scenario/delete-to-gc'; // 删除接口场景
export const ScenarioUploadTempFileUrl = '/api/scenario/upload/temp/file'; // 接口场景上传临时文件
export const ScenarioTransferFileUrl = '/api/scenario/transfer'; // 接口场景临时文件转存
export const ScenarioTransferModuleOptionsUrl = '/api/scenario/transfer/options'; // 接口场景临时文件转存目录
export const DebugScenarioUrl = '/api/scenario/debug'; // 接口场景调试（不保存报告）
export const ExecuteScenarioUrl = '/api/scenario/run'; // 接口场景执行（保存报告）
export const GetSystemRequestUrl = '/api/scenario/get/system-request'; // 获取导入的系统请求数据
export const BatchRecycleScenarioUrl = '/api/scenario/batch-operation/delete-gc'; // 批量删除接口场景
export const BatchMoveScenarioUrl = '/api/scenario/batch-operation/move'; // 批量移动接口场景
export const BatchCopyScenarioUrl = '/api/scenario/batch-operation/copy'; // 批量复制接口场景
export const BatchEditScenarioUrl = '/api/scenario/batch-operation/edit'; // 批量编辑接口场景
export const BatchRunScenarioUrl = '/api/scenario/batch-operation/run'; // 批量执行接口场景

//  回收站相关
export const GetTrashModuleTreeUrl = '/api/scenario/module/trash/tree';
export const GetTrashModuleCountUrl = '/api/scenario/module/trash/count';
export const ScenarioTrashPageUrl = '/api/scenario/trash/page';
export const DeleteScenarioUrl = '/api/scenario/delete';
export const RecoverScenarioUrl = '/api/scenario/recover';
export const BatchRecoverScenarioUrl = '/api/scenario/batch-operation/recover-gc';
export const BatchDeleteScenarioUrl = '/api/scenario/batch-operation/delete';

export const ExecuteHistoryUrl = '/api/scenario/execute/page'; // 场景执行历史
export const ScenarioHistoryUrl = '/api/scenario/operation-history/page'; // 场景变更历史