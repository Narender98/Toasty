package papaya.in.toasty.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public abstract class BaseFragment<T> extends Fragment {

    protected T binding;


    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        binding = getFragmentBinding(inflater, container);
        return ((ViewDataBinding) binding).getRoot();
    }


    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        init();
        initCtrl();
    }

    protected abstract T getFragmentBinding(LayoutInflater inflater, ViewGroup container);

    protected abstract void init();

    protected abstract void initCtrl();
}
