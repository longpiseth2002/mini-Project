package product;

public class Product {

    private Integer id;
    private String name;
    private Double unit;
    private Integer qty;
    private String date;
    public Product( Integer id , String name , Double unit , Integer qty , String date ){
        this.id=id;
        this.name=name;
        this.unit=unit;
        this.qty=qty;
        this.date=date;
    }

    public Product() {

    }

    public Integer getId() {
        return id;
    }

    public Product setId(Integer id) {
        this.id = id;
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnit() {
        return unit;
    }

    public void setUnit(Double unit) {
        this.unit = unit;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  id + " \t" + name + " \t"+ unit +
                " \t" + qty +
                " \t" + date ;
    }
}
