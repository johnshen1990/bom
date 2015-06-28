<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/commons/include/taglib-context.jsp" %>
<html>
<head>
    <title>交易查询</title>
    <style>
	#navigator {
		margin-top: 8px;
		margin-bottom: 8px;
	}
	/*固定表格标题CSS*/
	table .header-fixed {
		position: fixed;
		/* 10 less than .navbar-fixed to prevent any overlap */
		top: 0px;
		z-index: 1020;
		border-bottom: 1px solid #d5d5d5;
		-webkit-border-radius: 0;
		-moz-border-radius: 0;
		border-radius: 0;
		-webkit-box-shadow: inset 0 1px 0 #fff, 0 1px 5px rgba(0, 0, 0, 0.1);
		-moz-box-shadow: inset 0 1px 0 #fff, 0 1px 5px rgba(0, 0, 0, 0.1);
		/* IE6-9 */
		box-shadow: inset 0 1px 0 #fff, 0 1px 5px rgba(0, 0, 0, 0.1);
		filter: progid: DXImageTransform.Microsoft.gradient(enabled=false);
	}
	</style>
</head>
<body>
<div class="row" id="content">
    <%--<div class="col-xs-1"></div>--%>
    <div class="col-xs-12">
        <ul class="nav nav-pills" id="navigator">
            <li role="presentation" class="active"><a href="#">交易查询</a></li>
            <%--<li role="presentation"><a href="#">收支明细</a></li>--%>
            <%--<li role="presentation"><a href="#">结算查询</a></li>--%>
        </ul>
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title" style="display: inline-block; width: 90%;">查询条件</h3>
                <button type="button" class="btn btn-primary" id="search-button">查询</button>
            </div>
            <div class="panel-body">
                <form id="search-form" action="list.do" method="post">
                    <div class="row">
                        <div class="col-xs-6">
                            <label>交易时间:</label>
                            <span class="rapid-date-btns">
                                <button type="button" class="btn btn-default btn-xs ${trandataVo.rapidDateType eq 'all'?'active':''}" name="all">全部</button>
                                <button type="button" class="btn btn-default btn-xs ${trandataVo.rapidDateType eq 'today'?'active':''}" name="today">当日</button>
                                <button type="button" class="btn btn-default btn-xs ${trandataVo.rapidDateType eq 'yesterday'?'active':''}" name="yesterday">昨日</button>
                                <button type="button" class="btn btn-default btn-xs ${trandataVo.rapidDateType eq 'sevendays'?'active':''}" name="sevendays">7天</button>
                                <button type="button" class="btn btn-default btn-xs ${trandataVo.rapidDateType eq 'thirtydays'?'active':''}" name="thirtydays">30天</button>
                                <button type="button" class="btn btn-default btn-xs ${trandataVo.rapidDateType eq 'custom'?'active':''}" name="custom">自定义</button>
                                <input type="hidden" name="rapidDateType" value="${trandataVo.rapidDateType}"/>
                            </span>
                            <div class="input-daterange input-group datepicker">
                                <input type="text" class="input-sm form-control" name="startDate" value="${trandataVo.startDate}" readonly/>
                                <span class="input-group-addon"><i class="glyphicon glyphicon-remove"></i></span>
                                <span class="input-group-addon">至</span>
                                <input type="text" class="input-sm form-control" name="endDate" value="${trandataVo.endDate}" readonly/>
                                <span class="input-group-addon"><i class="glyphicon glyphicon-remove"></i></span>
                            </div>
                            <script>
                                $(function(){
                                    $('.datepicker').datepicker({
                                        language: "zh-CN",
                                        format: "yyyymmdd",
                                        autoclose:true
                                    });
                                    $('.glyphicon-remove').click(function(){
                                        $(this).parent().prev('input').val('');
                                    });
                                    //输入框的值改变的时候，将日期类型置为“自定义”
                                    $('.datepicker').children('input').change(function(){
                                        $(this).parent().prev('span.rapid-date-btns').children('input[name=rapidDateType]').val('custom');
                                        $(this).parent().prev('span.rapid-date-btns').children('button[name=custom]').siblings().removeClass('active');
                                        $(this).parent().prev('span.rapid-date-btns').children('button[name=custom]').addClass('active');
                                    });
                                    //点击“非自定义”日期类型的按钮时，按钮激活，更改对应的日期类型，将页码置为1，提交表单。
                                    $('.rapid-date-btns > button[name!=custom]').click(function(){
                                        var $this = $(this);
                                        //选中点击的按钮，其它按钮置为非选中
                                        $this.siblings().removeClass('active');
                                        $this.addClass('active');
                                        $this.siblings('input[name=rapidDateType]').val($this.attr('name'));
                                        $this.parents('form').find('input[name=pageNum]').val('1');
                                        $this.parents('form').submit();
                                    });
                                    //点击“自定义”按钮点击时，按钮激活，更改对应的日期类型，将页码置为1
                                    $('.rapid-date-btns > button[name=custom]').click(function(){
                                        var $this = $(this);
                                        //选中点击的按钮，其它按钮置为非选中
                                        $this.siblings().removeClass('active');
                                        $this.addClass('active');
                                        $this.siblings('input[name=rapidDateType]').val($this.attr('name'));
                                        $this.parents('form').find('input[name=pageNum]').val('1');
                                    });
                                });
                            </script>
                        </div>
                        <div class="col-xs-3">
                            <label for="trmNo">终端号:</label>
                            <input type="text" class="input-sm form-control" id="trmNo" name="trmNo" value="${trandataVo.trmNo}"/>
                        </div>
                        <div class="col-xs-3">
                            <label for="trmNo">卡号后4位:</label>
                            <input type="text" class="input-sm form-control" id="crdNo" name="crdNo" value="${trandataVo.crdNo}"/>
                        </div>
                    </div>
                    <input type="hidden" name="pageNum" value="${pageInfo.pageNum}" />
                    <input type="hidden" name="pageSize" value="${pageInfo.pageSize}" />
                </form>
            </div>
        </div>
        <table class="table table-hover table-striped table-fixed-header">
            <thead class="header">
	            <tr class="info">
	                <th>#</th>
	                <th>交易时间</th>
	                <th>终端号</th>
	                <th>终端批次号</th>
	                <th>终端流水号</th>
	                <th>交易类型</th>
	                <th>交易金额</th>
	                <th>手续费</th>
	                <th>卡号</th>
	                <th>状态</th>
	                <th>操作员编号</th>
	            </tr>
            </thead>
            <tbody>
            <c:choose>
                <c:when test="${empty trandataList}">
                    <tr>
                        <td colspan="11"><p class="text-center">暂无记录</p></td>
                    </tr>
                </c:when>
                <c:otherwise>
                    <c:forEach items="${trandataList}" var="item" varStatus="status">
                        <tr>
                            <th scope="row">${status.count+pageInfo.startRow-1}</th>
                            <td>${item.tranDt}&nbsp;${item.tranTm}</td>
                            <td>${item.trmNo}</td>
                            <td>${item.batNo}</td>
                            <td>${item.posSeqNo}</td>
                            <td>${item.tranCd}</td>
                            <td>${item.tranAmt}</td>
                            <td>${item.recFeeAmt}</td>
                            <td>${item.crdNo}</td>
                            <td>${item.tranSts}</td>
                            <td>${item.posOprId}</td>
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
            </tbody>
        </table>
        <div class="btn-group">
            <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false">
                每页记录数 <span class="caret"></span>
            </button>
            <ul class="dropdown-menu pagesize-select" role="menu" style="min-width:84px;padding:0;">
                <li><a href="#" pagesize="20" style="padding-top: 0;">20</a></li>
                <li><a href="#" pagesize="50" style="padding-top: 0;">50</a></li>
                <li><a href="#" pagesize="100" style="padding-top: 0;">100</a></li>
            </ul>
        </div>
        <bom:pageBar pageInfo="${pageInfo}" />
    </div>
</div>

<!-- 固定表格标题JS -->
<script src="${ctx}/static/lib/stickUp/fixedHeader.js"></script>

<script type="text/javascript">

    $(function(){
		//固定表格的标题
	    $('.table-fixed-header').fixedHeader();

        $('#search-button').click(function(){
            $(this).attr('disabled','disabled');
            $('#search-form').submit();
        });

        $('.pagesize-select').find('a').click(function(){
            event.preventDefault();
            $('input[name=pageSize]').val($(this).attr('pagesize'));
            $('#search-form').submit();
        });
    });

</script>
</body>
</html>
