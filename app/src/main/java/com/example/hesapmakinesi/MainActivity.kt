package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var sonuc = 0
        var yeniSayi = true
        var eskiOp = ""
        binding.btn0.setOnClickListener {
            if (yeniSayi) {
                binding.processEditText.text = "0"
                yeniSayi = false
            } else {
                binding.processEditText.text = binding.processEditText.text.toString() + "0"
            }
        }
        binding.btn1.setOnClickListener {
            if (yeniSayi) {
                binding.processEditText.text = "1"
                yeniSayi = false
            } else {
                binding.processEditText.text = binding.processEditText.text.toString() + "1"
            }
        }

        binding.btn2.setOnClickListener {
            if (yeniSayi) {
                binding.processEditText.text = "2"
                yeniSayi = false
            } else {
                binding.processEditText.text = binding.processEditText.text.toString() + "2"
            }
        }
        binding.btn3.setOnClickListener {
            if (yeniSayi) {
                binding.processEditText.text = "3"
                yeniSayi = false
            } else {
                binding.processEditText.text = binding.processEditText.text.toString() + "3"
            }
        }
        binding.btn4.setOnClickListener {
            if (yeniSayi) {
                binding.processEditText.text = "4"
                yeniSayi = false
            } else {
                binding.processEditText.text = binding.processEditText.text.toString() + "4"
            }
        }
        binding.btn5.setOnClickListener {
            if (yeniSayi) {
                binding.processEditText.text = "5"
                yeniSayi = false
            } else {
                binding.processEditText.text = binding.processEditText.text.toString() + "5"
            }
        }
        binding.btn6.setOnClickListener {
            if (yeniSayi) {
                binding.processEditText.text = "6"
                yeniSayi = false
            } else {
                binding.processEditText.text = binding.processEditText.text.toString() + "6"
            }
        }
        binding.btn7.setOnClickListener {
            if (yeniSayi) {
                binding.processEditText.text = "7"
                yeniSayi = false
            } else {
                binding.processEditText.text = binding.processEditText.text.toString() + "7"
            }
        }
        binding.btn8.setOnClickListener {
            if (yeniSayi) {
                binding.processEditText.text = "8"
                yeniSayi = false
            } else {
                binding.processEditText.text = binding.processEditText.text.toString() + "8"
            }
        }
        binding.btn9.setOnClickListener {
            if (yeniSayi) {
                binding.processEditText.text = "9"
                yeniSayi = false
            } else {
                binding.processEditText.text = binding.processEditText.text.toString() + "9"
            }
        }
        binding.btnSum.setOnClickListener {
            if (yeniSayi) {
                eskiOp = "+"
            } else {
                sonuc += binding.processEditText.text.toString().toInt()
                binding.processEditText.text = sonuc.toString()
                yeniSayi = true
                eskiOp = "+"
            }
        }




        binding.btnAc.setOnClickListener {
            sonuc = 0
            yeniSayi = true
            eskiOp = ""
            binding.processEditText.text = "0"
        }

        binding.btnResult.setOnClickListener {
            if (!yeniSayi) {
                if (eskiOp == "+") {
                    sonuc += binding.processEditText.text.toString().toInt()
                    binding.liveResultEditText.text = sonuc.toString()

                } else if (eskiOp == "-") {
                    sonuc -= binding.processEditText.text.toString().toInt()
                    binding.processEditText.text = sonuc.toString()

                }
                yeniSayi = true
                eskiOp = ""
            }
        }






        setContentView(binding.root)
    }
}