package P1003.Main;

import java.io.*;

public class Main {
  
  static Counter[] memory;

  public static void main(String[] args) throws IOException {
    // BufferedReader reader = new BufferedReader(new FileReader("./P1003/Main/input.txt"));
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    int caseCount = Integer.parseInt(reader.readLine());

    for (int i = 0; i < caseCount; i++) {
      int N = Integer.parseInt(reader.readLine());
      memory = new Counter[N + 1];
      Counter counter = getFibonacci(N);
      writer.write(counter.toString());
      writer.newLine();
    }
    writer.flush();
    writer.close();
    reader.close();
    return;
  }

  static Counter getFibonacci (int n) {
    if (memory[n] == null) {
      Counter counter = new Counter();
      if (n == 0) {
        counter.zero++;
      } else if (n == 1) {
        counter.one++;
      } else {
        Counter first = getFibonacci(n - 1);
        counter.zero += first.zero;
        counter.one += first.one;
        Counter second = getFibonacci(n - 2);
        counter.zero += second.zero;
        counter.one += second.one;
      }
      memory[n] = counter;
    }
    
    return memory[n];
  }
}

class Counter {
  int zero;
  int one;

  public Counter () {
    this.zero = 0;
    this.one = 0;
  }
  
  @Override
  public String toString() {
    return zero + " " + one;
  }
}
