package cs454.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.Intent;
import java.math.*;

import java.io.*;
import java.util.*;


public class SecondActivity extends ActionBarActivity {
    private EditText textField;
    private Button delete, sin, cos, tan, i , ln, log, π, e, percent, factorial, square_root, power, left_parenthesis, right_parenthesis;
    private String symbol, number;
    private double number1, number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textField = (EditText) findViewById(R.id.textField);
        delete = (Button) findViewById(R.id.delete);
        sin = (Button) findViewById(R.id.sin);
        cos = (Button) findViewById(R.id.cos);
        tan = (Button) findViewById(R.id.tan);
        i = (Button) findViewById(R.id.imaginary);
        ln = (Button) findViewById(R.id.natural_log);
        log = (Button) findViewById(R.id.log);
        π = (Button) findViewById(R.id.pi);
        e = (Button) findViewById(R.id.e);
        percent = (Button) findViewById(R.id.percent);
        factorial = (Button) findViewById(R.id.factorial);
        square_root = (Button) findViewById(R.id.square_root);
        power = (Button) findViewById(R.id.power);
        left_parenthesis = (Button) findViewById(R.id.left_parenthesis);
        right_parenthesis = (Button) findViewById(R.id.right_parenthesis);

        number = getIntent().getStringExtra("number");
        textField.setText(number);

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
        sin.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       if (textField.getText().length() == 0) {
                                       } else {
                                           textField.setText(Double.toString(Math.sin(Double.parseDouble(textField.getText().toString()))));
                                       }
                                   }
                               }

        );
        cos.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       if (textField.getText().length() == 0) {
                                       } else {
                                           textField.setText(Double.toString(Math.cos(Double.parseDouble(textField.getText().toString()))));
                                       }
                                   }
                               }

        );
        tan.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       if (textField.getText().length() == 0) {
                                       } else {
                                           textField.setText(Double.toString(Math.tan(Double.parseDouble(textField.getText().toString()))));
                                       }
                                   }
                               }

        );
        i.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     if (textField.getText().length() == 0) {
                                     }
                                 }
                             }

        );
        ln.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      if (textField.getText().length() == 0) {
                                      } else {
                                          textField.setText(Double.toString(Math.log(Double.parseDouble(textField.getText().toString()))));
                                      }
                                  }
                              }

        );
        log.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      if (textField.getText().length() == 0) {
                                      } else {
                                          textField.setText(Double.toString(Math.log10(Double.parseDouble(textField.getText().toString()))));
                                      }
                                  }
                              }

        );
        π.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     if (textField.getText().length() == 0) {
                                     } else {
                                         textField.setText(Double.toString(Math.PI));
                                     }
                                 }
                             }

        );
        e.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     if (textField.getText().length() == 0) {
                                     } else {
                                         textField.setText(Double.toString(Math.E));
                                     }
                                 }
                             }

        );
        percent.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           if (textField.getText().length() == 0) {
                                           } else {
                                               textField.setText(Double.toString((Double.parseDouble(textField.getText().toString())/100)));
                                           }
                                       }
                                   }

        );
        factorial.setOnClickListener(new View.OnClickListener() {
                                                           @Override
                                                           public void onClick(View v) {
                                                               if (textField.getText().length() == 0) {
                                                               } else {
                                                                   factorial(Double.parseDouble(textField.getText().toString()));
                                                               }
                                                           }
                                                       }

        );
        square_root.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             if (textField.getText().length() == 0) {
                                             } else {
                                                 textField.setText(Double.toString(Math.sqrt(Double.parseDouble(textField.getText().toString()))));
                                             }
                                         }
                                     }

        );
        power.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               if (textField.getText().length() == 0) {
                                               } else {
                                                   textField.setText(Double.toString(Math.pow(Double.parseDouble(textField.getText().toString()),2)));
                                               }
                                           }
                                       }

        );
        left_parenthesis.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               if (textField.getText().length() == 0) {
                                               } else {
                                                   textField.setText(textField.getText() + "(");
                                               }
                                           }
                                       }

        );
        right_parenthesis.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    if (textField.getText().length() == 0) {
                                                    } else {
                                                        textField.setText(textField.getText() + ")");
                                                    }
                                                }
                                            }

        );






    }



    public double factorial(double number) {
        double result = 0;
        if(number == 1) {
            return 1;
        }
        else if(number > 1){
            result =  number * factorial(number - 1);
        }
        return result;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);

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
        }if(id ==R.id.MainActivity){

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
