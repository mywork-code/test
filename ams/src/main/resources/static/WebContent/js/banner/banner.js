$(function(){
//Grid
    $('#bannerList').datagrid({
        title: 'banner信息',
        fit: true,
        fitColumns: true,
        rownumbers: true,
        pagination: true,
        singleSelect: true,
        striped: true,
        toolbar: '#tb',
        columns: [[{
            title: 'BannerID',
            field: 'id',
            width: 50,
            align: 'center'
        }, {
            title: '类型',
            field: 'bannerType',
            width: 100,
            align: 'center'
        }, {
            title: '排序',
            field: 'bannerOrder',
            width: 100,
            align: 'center'
        }
        ]],
        loader : function(param, success, error) {
            $.ajax({
                url : ctx + '/test/banner/query',
                data : param,
                type : "post",
                dataType : "json",
                success : function(data) {
                    $.validateResponse(data, function() {
                        // debugger;
                        success(data);
                    });
                }
            })
        }
    })

})