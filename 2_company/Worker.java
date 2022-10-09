public class Worker extends Staff {
  protected int quantity;

  public Worker(String name, String email, int fromYear, int quantity) {
    super(name, email, fromYear);
    this.quantity = quantity;
  }

  // copy constructor: this time anotherWorker of class Worker convert to Staff
  public Worker(Worker anotherWorker, int quantity) {
    super((Staff) anotherWorker);
    this.quantity = quantity;
  }

  @Override
  protected double mainSalary() {
    return this.quantity * 10;
  }
}