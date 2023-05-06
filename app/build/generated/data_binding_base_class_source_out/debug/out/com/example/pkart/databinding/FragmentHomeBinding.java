// Generated by view binder compiler. Do not edit!
package com.example.pkart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pkart.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView categoryRecycler;

  @NonNull
  public final RecyclerView productRecycler;

  @NonNull
  public final ImageView sliderImage;

  private FragmentHomeBinding(@NonNull LinearLayout rootView,
      @NonNull RecyclerView categoryRecycler, @NonNull RecyclerView productRecycler,
      @NonNull ImageView sliderImage) {
    this.rootView = rootView;
    this.categoryRecycler = categoryRecycler;
    this.productRecycler = productRecycler;
    this.sliderImage = sliderImage;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.categoryRecycler;
      RecyclerView categoryRecycler = ViewBindings.findChildViewById(rootView, id);
      if (categoryRecycler == null) {
        break missingId;
      }

      id = R.id.productRecycler;
      RecyclerView productRecycler = ViewBindings.findChildViewById(rootView, id);
      if (productRecycler == null) {
        break missingId;
      }

      id = R.id.sliderImage;
      ImageView sliderImage = ViewBindings.findChildViewById(rootView, id);
      if (sliderImage == null) {
        break missingId;
      }

      return new FragmentHomeBinding((LinearLayout) rootView, categoryRecycler, productRecycler,
          sliderImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
