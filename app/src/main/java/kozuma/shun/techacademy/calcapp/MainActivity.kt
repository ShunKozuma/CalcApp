package kozuma.shun.techacademy.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonplus.setOnClickListener{
            if(editText.text.toString().equals("") || editText2.text.toString().equals("")){
                val snack = Snackbar.make(it,"何か数値を入力してください",Snackbar.LENGTH_LONG)
                snack.show()
            }else{
                val intent = Intent(this, ResultActivity::class.java)

                val answer: Double = editText.text.toString().toDouble() + editText2.text.toString().toDouble()
                intent.putExtra("answer", answer)

                startActivity(intent)
            }
        }

        buttonminus.setOnClickListener{
            if(editText.text.toString().equals("") || editText2.text.toString().equals("")){
                val snack = Snackbar.make(it,"何か数値を入力してください",Snackbar.LENGTH_LONG)
                snack.show()
            }else{
                val intent = Intent(this, ResultActivity::class.java)

                val answer: Double = editText.text.toString().toDouble() - editText2.text.toString().toDouble()
                intent.putExtra("answer", answer)

                startActivity(intent)
            }
        }

        buttonmultiplied.setOnClickListener{
            if(editText.text.toString().equals("") || editText2.text.toString().equals("")){
                val snack = Snackbar.make(it,"何か数値を入力してください",Snackbar.LENGTH_LONG)
                snack.show()
            }else{
                val intent = Intent(this, ResultActivity::class.java)

                val answer: Double = editText.text.toString().toDouble() * editText2.text.toString().toDouble()
                intent.putExtra("answer", answer)

                startActivity(intent)
            }
        }

        buttondivided.setOnClickListener{
            if(editText.text.toString().equals("") || editText2.text.toString().equals("")){
                val snack = Snackbar.make(it,"何か数値を入力してください",Snackbar.LENGTH_LONG)
                snack.show()
            }else{
                val intent = Intent(this, ResultActivity::class.java)

                val answer: Double = editText.text.toString().toDouble() / editText2.text.toString().toDouble()
                intent.putExtra("answer", answer)

                startActivity(intent)
            }
        }

    }




}
