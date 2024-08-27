package com.sales.repository.help.product;

import com.sales.repository.help.JsonConversion;

import java.util.List;

public class ProductsFromJson implements ProductRepository {

    @Override
    public List<Object> getProducts() {
        JsonConversion conversion = new JsonConversion();
        List<TaskBean> list =  conversion.<List<TaskBean>>convertJsonToPOJO("E:/J2eeWorkspaces/az_workspace_svn/az-client-service/dir1/dir2/filename.json", TaskBean.class);
        return List.of();
    }
}
