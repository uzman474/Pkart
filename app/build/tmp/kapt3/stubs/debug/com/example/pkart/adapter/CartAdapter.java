package com.example.pkart.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/pkart/adapter/CartAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/pkart/adapter/CartAdapter$CartViewHolder;", "context", "Landroid/content/Context;", "list", "", "Lcom/example/pkart/roomdb/ProductModel;", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "getList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CartViewHolder", "app_debug"})
public final class CartAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.pkart.adapter.CartAdapter.CartViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.pkart.roomdb.ProductModel> list = null;
    
    public CartAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pkart.roomdb.ProductModel> list) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pkart.roomdb.ProductModel> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.pkart.adapter.CartAdapter.CartViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.pkart.adapter.CartAdapter.CartViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/pkart/adapter/CartAdapter$CartViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/pkart/databinding/LayoutCartItemBinding;", "(Lcom/example/pkart/adapter/CartAdapter;Lcom/example/pkart/databinding/LayoutCartItemBinding;)V", "getBinding", "()Lcom/example/pkart/databinding/LayoutCartItemBinding;", "app_debug"})
    public final class CartViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.pkart.databinding.LayoutCartItemBinding binding = null;
        
        public CartViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.pkart.databinding.LayoutCartItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.pkart.databinding.LayoutCartItemBinding getBinding() {
            return null;
        }
    }
}