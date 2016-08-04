package Classes.Product;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Lakmi
 */
public class SetOfProductStock extends Vector<ProductStockImp> implements Serializable {

    private static final long serialVersionUID = 2428035439452881234L;
    SetOfProductStock productStockSet;

    public SetOfProductStock() {
        super();
    }

    public void addProductStock(ProductStockImp aProduct) {
        super.add(aProduct);
    }

    public String updateProductStock(ProductStockImp aProduct, int id, double qty, double price, String date) {
        String status = "";
        try {

          
            this.elementAt(this.indexOf(aProduct)).setDate(date);
            this.elementAt(this.indexOf(aProduct)).setProductID(id);
            this.elementAt(this.indexOf(aProduct)).setPrice(price);
            this.elementAt(this.indexOf(aProduct)).setQuantity(qty);

            status = "success";
        } catch (Exception ex) {
            status = "fail";
        }
        return status;
    }
//get product stock from product ID

    public SetOfProductStock getProductStockFromID(int number) {

        productStockSet = new SetOfProductStock();
        for (ProductStockImp product : this) {
            if (product.getProductID() == number) {
                productStockSet.addProductStock(product);
            }
        }
        return productStockSet;
    }

    //get product stock from stock id
    public SetOfProductStock getProductStockFromStockID(int number) {

        productStockSet = new SetOfProductStock();
        for (ProductStockImp product : this) {
            if (product.getStockNo() == number) {
                productStockSet.addProductStock(product);
            }
        }
        return productStockSet;
    }

    public boolean removeProductStock(ProductStockImp pro) {
        return super.remove(pro);
    }
}
