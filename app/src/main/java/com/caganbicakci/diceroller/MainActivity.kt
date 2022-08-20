package com.caganbicakci.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.caganbicakci.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRoll.setOnClickListener{
            rollDice()
        }

    }

    private fun rollDice() {
        val random = (1..6).random()
        val selectedDice = when(random){
            1-> R.drawable.ic_dice_1
            2-> R.drawable.ic_dice_2
            3-> R.drawable.ic_dice_3
            4-> R.drawable.ic_dice_4
            5-> R.drawable.ic_dice_5
            else-> R.drawable.ic_dice_6
        }
        binding.ivDice.setImageResource(selectedDice)

    }
}