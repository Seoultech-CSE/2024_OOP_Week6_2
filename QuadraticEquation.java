Class QuadraticEquation {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a, b, c : ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    QESolver solver = new QESolver(______);
    double discriminant = solver.getDiscriminant();

    if(discriminant == 0) {
      System.out.println();
    }
  }
}
