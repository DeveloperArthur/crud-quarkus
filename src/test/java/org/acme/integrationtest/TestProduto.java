package org.acme.integrationtest;

import com.github.database.rider.cdi.api.DBRider;
import com.github.database.rider.core.api.dataset.DataSet;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.acme.Produto;
import org.junit.Assert;
import org.junit.Test;

@DBRider
@QuarkusTest
@QuarkusTestResource(DatabaseLifecycle.class)
public class TestProduto {

    @Test
    @DataSet("produtos.yml")
    public void test(){
        Assert.assertEquals(1, Produto.count());
    }
}
