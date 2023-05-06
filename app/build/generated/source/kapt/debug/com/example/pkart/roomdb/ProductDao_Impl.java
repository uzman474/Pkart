package com.example.pkart.roomdb;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDao_Impl implements ProductDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProductModel> __insertionAdapterOfProductModel;

  private final EntityDeletionOrUpdateAdapter<ProductModel> __deletionAdapterOfProductModel;

  public ProductDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProductModel = new EntityInsertionAdapter<ProductModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `products` (`productId`,`productName`,`productImage`,`productSp`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductModel value) {
        if (value.getProductId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getProductId());
        }
        if (value.getProductName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProductName());
        }
        if (value.getProductImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getProductImage());
        }
        if (value.getProductSp() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getProductSp());
        }
      }
    };
    this.__deletionAdapterOfProductModel = new EntityDeletionOrUpdateAdapter<ProductModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `products` WHERE `productId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductModel value) {
        if (value.getProductId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getProductId());
        }
      }
    };
  }

  @Override
  public Object insertProduct(final ProductModel product,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductModel.insert(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteProduct(final ProductModel product,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfProductModel.handle(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<ProductModel>> getAllProducts() {
    final String _sql = "SELECT * FROM products";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"products"}, false, new Callable<List<ProductModel>>() {
      @Override
      public List<ProductModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "productId");
          final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "productName");
          final int _cursorIndexOfProductImage = CursorUtil.getColumnIndexOrThrow(_cursor, "productImage");
          final int _cursorIndexOfProductSp = CursorUtil.getColumnIndexOrThrow(_cursor, "productSp");
          final List<ProductModel> _result = new ArrayList<ProductModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ProductModel _item;
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpProductName;
            if (_cursor.isNull(_cursorIndexOfProductName)) {
              _tmpProductName = null;
            } else {
              _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
            }
            final String _tmpProductImage;
            if (_cursor.isNull(_cursorIndexOfProductImage)) {
              _tmpProductImage = null;
            } else {
              _tmpProductImage = _cursor.getString(_cursorIndexOfProductImage);
            }
            final String _tmpProductSp;
            if (_cursor.isNull(_cursorIndexOfProductSp)) {
              _tmpProductSp = null;
            } else {
              _tmpProductSp = _cursor.getString(_cursorIndexOfProductSp);
            }
            _item = new ProductModel(_tmpProductId,_tmpProductName,_tmpProductImage,_tmpProductSp);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public ProductModel isExit(final String id) {
    final String _sql = "SELECT * FROM products WHERE productId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "productId");
      final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "productName");
      final int _cursorIndexOfProductImage = CursorUtil.getColumnIndexOrThrow(_cursor, "productImage");
      final int _cursorIndexOfProductSp = CursorUtil.getColumnIndexOrThrow(_cursor, "productSp");
      final ProductModel _result;
      if(_cursor.moveToFirst()) {
        final String _tmpProductId;
        if (_cursor.isNull(_cursorIndexOfProductId)) {
          _tmpProductId = null;
        } else {
          _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
        }
        final String _tmpProductName;
        if (_cursor.isNull(_cursorIndexOfProductName)) {
          _tmpProductName = null;
        } else {
          _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
        }
        final String _tmpProductImage;
        if (_cursor.isNull(_cursorIndexOfProductImage)) {
          _tmpProductImage = null;
        } else {
          _tmpProductImage = _cursor.getString(_cursorIndexOfProductImage);
        }
        final String _tmpProductSp;
        if (_cursor.isNull(_cursorIndexOfProductSp)) {
          _tmpProductSp = null;
        } else {
          _tmpProductSp = _cursor.getString(_cursorIndexOfProductSp);
        }
        _result = new ProductModel(_tmpProductId,_tmpProductName,_tmpProductImage,_tmpProductSp);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
