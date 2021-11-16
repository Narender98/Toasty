package papaya.in.toasty.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import org.jetbrains.annotations.NotNull;

public abstract class BaseBottomSheet<T> extends BottomSheetDialogFragment {
    protected T binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       binding=getBottomSheetBinding(inflater,container);
       return ((ViewDataBinding) binding).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        init();
        initCtrl();
    }

    protected abstract T getBottomSheetBinding(LayoutInflater inflater, ViewGroup container);

    protected abstract void init();

    protected abstract void initCtrl();

}
