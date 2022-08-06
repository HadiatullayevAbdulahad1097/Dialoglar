package developer.abdulahad.dialoglar

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.snackbar.Snackbar
import developer.abdulahad.dialoglar.databinding.ActivityMainBinding
import developer.abdulahad.dialoglar.databinding.ItemDialogBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        SnackBarDialog

//        ||
//        ||
//        ||
//        ||
//        ||
//   ||   ||   ||
//    ||  ||  ||
//     || || ||
//       ||||
//        ||

// binding.btnDialog.setOnClickListener {
//     val snackBar = Snackbar.make(it,"Salom snackbar",Snackbar.LENGTH_LONG)
//     snackBar.setAction("Click",object :View.OnClickListener{
//         override fun onClick(v: View?) {
//             Toast.makeText(this@MainActivity, "Click", Toast.LENGTH_SHORT).show()
//         }
//
//     })
//     snackBar.show()
// }
//        BottomDialog
//        ||
//        ||
//        ||
//        ||
//        ||
//   ||   ||   ||
//    ||  ||  ||
//     || || ||
//       ||||
//        ||

//binding.btnDialog.setOnClickListener {
//
//    val bottom = BottomSheetDialog(this)
//    bottom.setContentView(ItemDialogBinding.inflate(layoutInflater).root)
//    bottom.show()
//}

//        TimePickerDialog
//        ||
//        ||
//        ||
//        ||
//        ||
//   ||   ||   ||
//    ||  ||  ||
//     || || ||
//       ||||
//        ||

//        binding.btnDialog.setOnClickListener {
//
//            val timePickerDialog = TimePickerDialog(
//                this,
//                object : TimePickerDialog.OnTimeSetListener{
//                    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
//                        Toast.makeText(this@MainActivity, "$hourOfDay : $minute ", Toast.LENGTH_SHORT).show()
//                    }
//                },
//            12,
//            36,
//                true
//            )
//
//            timePickerDialog.show()
//        }

 // DataPickerDialog
//        ||
//        ||
//        ||
//        ||
//        ||
//   ||   ||   ||
//    ||  ||  ||
//     || || ||
//       ||||
//        ||

//        binding.btnDialog.setOnClickListener {
//            val datePicker = DatePickerDialog(this)
//
//            datePicker.setOnDateSetListener(object : DatePickerDialog.OnDateSetListener{
//                override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
//
//                    datePicker.updateDate(2005,5,12)
//
//                    Toast.makeText(this@MainActivity, "$year.$month.$dayOfMonth", Toast.LENGTH_SHORT).show()
//                }
//
//            })
//
//            datePicker.show()
//        }

//        FragmentDialog
//        ||
//        ||
//        ||
//        ||
//        ||
//   ||   ||   ||
//    ||  ||  ||
//     || || ||
//       ||||
//        ||

//    binding.btnDialog.setOnClickListener {
//        val dialog = MyDialogFragment()
//        dialog.show(supportFragmentManager.beginTransaction(),"Nimadur")
//    }

//        CustomDialog
//        ||
//        ||
//        ||
//        ||
//        ||
//   ||   ||   ||
//    ||  ||  ||
//     || || ||
//       ||||
//        ||

//        binding.btnDialog.setOnClickListener {
//            val alertDialog = AlertDialog.Builder(this, R.style.NewDialog)
//
//            val itemDialogBinding = ItemDialogBinding.inflate(layoutInflater)
//            alertDialog.setView(itemDialogBinding.root)
//
//            alertDialog.show()
//        }
//            alertDialog.setTitle("Sarlavha")

    // AlertDialog
//        ||
//        ||
//        ||
//        ||
//        ||
//   ||   ||   ||
//    ||  ||  ||
//     || || ||
//       ||||
//        ||

//        val alertDialog = AlertDialog.Builder(this, R.style.NewDialog)

//        val list = arrayOf("Ramizbek","Abdusamid","Abdulaziz")
//        val chList = booleanArrayOf(false,false,false)
//
//        alertDialog.setSingleChoiceItems(list, -1,object : DialogInterface.OnClickListener{
//            override fun onClick(dialog: DialogInterface?, which: Int) {
//                Toast.makeText(this@MainActivity, "$dialog", Toast.LENGTH_SHORT).show()
//            }
//
//        })
//
//        alertDialog.setMultiChoiceItems(
//            list,
//            chList,
//            object : DialogInterface.OnMultiChoiceClickListener{
//                override fun onClick(dialog: DialogInterface?, which: Int, isChecked: Boolean) {
//                    Toast.makeText(this@MainActivity, "${list[which]} $isChecked", Toast.LENGTH_SHORT).show()
//                }
//            }
//        )
//
//        alertDialog.setNegativeButton("No",object : DialogInterface.OnClickListener{
//            override fun onClick(dialog: DialogInterface?, which: Int) {
//                Toast.makeText(this@MainActivity, "No", Toast.LENGTH_SHORT).show()
//            }
//        })
//        alertDialog.setPositiveButton("Yes", object : DialogInterface.OnClickListener{
//            override fun onClick(dialog: DialogInterface?, which: Int) {
//                Toast.makeText(this@MainActivity, "Yes", Toast.LENGTH_SHORT).show()
//            }
//        })
//        alertDialog.setNegativeButton("cancel",object : DialogInterface.OnClickListener{
//            override fun onClick(dialog: DialogInterface?, which: Int) {
//                Toast.makeText(this@MainActivity, "Cancel", Toast.LENGTH_SHORT).show()
//            }
//        })
//alertDialog.show()
    }
}