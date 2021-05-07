package za.co.jalia.springbootandrest;

class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id){
        super("Couldn't find employee" + id);
    }
}
