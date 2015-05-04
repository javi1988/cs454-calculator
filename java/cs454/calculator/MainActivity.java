package cs454.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.Intent;

import java.io.*;
import java.util.*;


public class MainActivity extends ActionBarActivity {
    private EditText textField;
    private Button delete, seven, eight, nine, divide, four, five, six, multiply, one, two, three, subtract, decimal, zero, equal, add;
    private String symbol;
    private double number1, number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        textField = (EditText) findViewById(R.id.textField);
        delete = (Button) findViewById(R.id.delete);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        divide = (Button) findViewById(R.id.divide);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        multiply = (Button) findViewById(R.id.multiply);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        subtract = (Button) findViewById(R.id.subtract);
        decimal = (Button) findViewById(R.id.decimal);
        zero = (Button) findViewById(R.id.zero);
        equal = (Button) findViewById(R.id.equal);
        add = (Button) findViewById(R.id.add);

        delete.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          if (textField.getText().length() == 0) {
                                          } else {
                                              textField.setText(textField.getText().subSequence(0, textField.length() - 1));
                                          }
                                      }
                                  }

        );

        seven.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         textField.setText(textField.getText() + "7");
                                     }
                                 }

        );

        eight.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         textField.setText(textField.getText() + "8");
                                     }
                                 }

        );

        nine.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        textField.setText(textField.getText() + "9");
                                    }
                                }

        );

        divide.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          symbol = "/";
                                          number1 = Double.parseDouble(textField.getText().toString());
                                          textField.setText("");
                                      }
                                  }

        );

        four.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        textField.setText(textField.getText() + "4");
                                    }
                                }

        );

        five.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        textField.setText(textField.getText() + "5");
                                    }
                                }

        );

        six.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       textField.setText(textField.getText() + "6");
                                   }
                               }

        );

        multiply.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            symbol = "*";
                                            number1 = Double.parseDouble(textField.getText().toString());
                                            textField.setText("");
                                        }
                                    }

        );

        one.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       textField.setText(textField.getText() + "1");
                                   }
                               }

        );

        two.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       textField.setText(textField.getText() + "2");
                                   }
                               }

        );

        three.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         textField.setText(textField.getText() + "3");
                                     }
                                 }

        );

        subtract.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            symbol = "-";
                                            number1 = Double.parseDouble(textField.getText().toString());
                                            textField.setText("");
                                        }
                                    }

        );

        decimal.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           textField.setText(textField.getText() + ".");
                                       }
                                   }

        );

        zero.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        textField.setText(textField.getText() + "0");
                                    }
                                }

        );

        equal.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         number2 = Double.parseDouble(textField.getText().toString());
                                         if (symbol == " ") {
                                             number1 = 0;
                                         }
                                         calculate(symbol, number1, number2);
                                     }
                                 }

        );

        add.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       symbol = "+";
                                       number1 = Double.parseDouble(textField.getText().toString());
                                       textField.setText("");
                                   }
                               }

        );

    }

    public void calculate(String symbol, double number1, double number2) {
        if (symbol == "/") {
            textField.setText(Double.toString(number1 / number2));
        } else if (symbol == "+") {
            textField.setText(Double.toString(number1 + number2));
        } else if (symbol == "*") {
            textField.setText(Double.toString(number1 * number2));
        } else if (symbol == "-") {
            textField.setText(Double.toString(number1 - number2));
        } else {
            textField.setText("ERROR");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
