package com.example.pkart.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.pkart.R

public class HomeFragmentDirections private constructor() {
  public companion object {
    public fun actionHomeFragmentToCartFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_cartFragment)

    public fun actionHomeFragmentSelf(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_self)
  }
}
