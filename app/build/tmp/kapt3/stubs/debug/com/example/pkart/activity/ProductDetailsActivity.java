package com.example.pkart.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002J.\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/pkart/activity/ProductDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/pkart/databinding/ActivityProductDetailsBinding;", "addToCart", "", "productDao", "Lcom/example/pkart/roomdb/ProductDao;", "proId", "", "name", "productSp", "coverImg", "cartAction", "getProductDetails", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openCart", "app_debug"})
public final class ProductDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.pkart.databinding.ActivityProductDetailsBinding binding;
    
    public ProductDetailsActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getProductDetails(java.lang.String proId) {
    }
    
    private final void cartAction(java.lang.String proId, java.lang.String name, java.lang.String productSp, java.lang.String coverImg) {
    }
    
    private final void addToCart(com.example.pkart.roomdb.ProductDao productDao, java.lang.String proId, java.lang.String name, java.lang.String productSp, java.lang.String coverImg) {
    }
    
    private final void openCart() {
    }
}