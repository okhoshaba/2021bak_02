//  Контрольний приклад рішення задачі 
//  згідно алгоритму на рис. 4.3
//
import static javax.swing.JOptionPane.*;

class Operators {
  public static void main(String[] args) {
    String viklik, nastvikik, operators;
    int ioperators, inastvikik, ivikik, opergroup;
    boolean endOperators;

    endOperators = true;

    do {

      // Отримання виклику від абонента
      viklik = showInputDialog(null, "Виклик", 
        "Отримання виклику від абонента, вкажіть групу операторів", 
        QUESTION_MESSAGE);

      ivikik = Integer.parseInt(viklik);
      if ((ivikik == 1) || (ivikik == 2))
        opergroup = ivikik;
      else
        opergroup = 3;

      showMessageDialog(null, "Виклик отримано, група: "  + opergroup);

    // Визначення кількості операторів
      nastvikik = showInputDialog(null, "Наступний виклик є ? (ні - 1, так - 0)", 
        "Наступний виклик", 
        QUESTION_MESSAGE);
      inastvikik = Integer.parseInt(nastvikik);

      if (inastvikik == 0)
        endOperators = false;
      else {
        // Визначення кількості операторів
        operators = showInputDialog(null, "Вiльні оператори є ? (ні - 1, так - 0)", 
        "Оператори", 
        QUESTION_MESSAGE);
        ioperators = Integer.parseInt(operators);
        if (ioperators == 0)
          endOperators = false;
        else
          endOperators = true;
      }

      } while(endOperators);

  }

}
