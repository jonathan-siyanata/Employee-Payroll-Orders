package za.co.jalia.springbootandrest;

class OrderNotFoundException extends RuntimeException {
        OrderNotFoundException(Long id){
            super("Couldn't find order" + id);
        }
    }
