<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table id="equipmentsDataTable" class=" table table-striped table-bordered table-hover">
    <thead>
    <tr>
        <th data-column-id="id" data-width="5%">序号</th>
        <th data-column-id="id" data-type="numeric" data-identifier="true" data-visible="false" data-width="5%">ID</th>
        <th data-column-id="eqCode" data-width="10%">设备编号</th>
        <th data-column-id="locations" data-width="25%" data-converter="showLocName">设备位置</th>
        <th data-column-id="description" data-width="25%">设备名称</th>
        <th data-column-id="equipmentsClassification" data-width="15%" data-converter="showEqClass">设备分类</th>
        <th data-column-id="status" data-width="5%" data-converter="showStatus">设备状态</th>
        <th data-column-id="running" data-width="5%" data-converter="showRunStatus">运行状态</th>
        <th data-column-id="report" data-formatter="report" data-sortable="false" data-width="5%">报修</th>
    </tr>
    </thead>
</table>

