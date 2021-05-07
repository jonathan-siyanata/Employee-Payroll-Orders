package za.co.jalia.springbootandrest;

class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super("Couldn't find order!!");
    }
}
