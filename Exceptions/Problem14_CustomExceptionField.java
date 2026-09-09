package Exceptions;


    class OutofStackException extends Exception {
        private String productName;
        OutofStackException(String productName ,String message){
            super(message);
            this.productName = productName;
        }
        public String getProduceName(){
            return productName;
        }
    }

    class Store{
        void purchase(String productName, int stock) throws OutofStackException{
            if(stock <= 0){
                throw new OutofStackException(productName,"Stack is less");
            }
            System.out.print("Purchased");
        }
    }
    public class Problem14_CustomExceptionField {
        public static void main(String[] args) {

            Store store = new Store();


            try {

                store.purchase(
                        "Laptop",
                        0
                );

            }
            catch(OutofStackException e) {

                System.out.println(
                        "Product: "
                        + e.getProduceName()
                );

                System.out.println(
                        "Error: "
                        + e.getMessage()
                );
            }
        }
}
