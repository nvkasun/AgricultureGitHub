package Classes.Product;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Lakmi
 */
public class SetOfProducts extends Vector<ProductsImp> implements Serializable {
    
    private static final long serialVersionUID = 2428035439452881234L;
    SetOfProducts productSet;
    
    public SetOfProducts() {
        super();
    }
    
    public void addProducts(ProductsImp aProduct) {
        super.add(aProduct);
    }
    
    public String updateProducts(ProductsImp aProduct, String Name, String description,byte[] image) {
        String status = "";
        try {
            
            this.elementAt(this.indexOf(aProduct)).setName(Name);
            this.elementAt(this.indexOf(aProduct)).setDescription(description);
            this.elementAt(this.indexOf(aProduct)).setImage(image);
            
            status = "success";
        } catch (Exception ex) {
            status = "fail";
        }
        return status;
    }
    
    public SetOfProducts getProductFromID(int number) {
        
        productSet = new SetOfProducts();
        for (ProductsImp product : this) {
            if (product.getProductNo() == number) {
                productSet.addProducts(product);
                
            }
        }
        return productSet;
    }
    
    public SetOfProducts getProductFromName(String name) {
        
        productSet = new SetOfProducts();
        for (ProductsImp product : this) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                productSet.addProducts(product);
                
            }
        }
        return productSet;
    }
    
    public boolean removeProduct(ProductsImp pro) {
        return super.remove(pro);
    }
}
