package papaya.in.toasty.base;

import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;

public abstract class BaseDialog<T> extends DialogFragment {

    protected T binding;

    @Override
    public void onStart() {
        super.onStart();
        //setStyle(DialogFragment.STYLE_NO_FRAME, R.style.FullScreenDialog);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        getDialog().getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        init();
        initCtrl();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = getDialogBinding(inflater, container);
        return ((ViewDataBinding) binding).getRoot();
    }

    protected abstract T getDialogBinding(LayoutInflater inflater, ViewGroup container);

    protected abstract void init();

    protected abstract void initCtrl();

}
