import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public abstract class AdapterItensVenda extends FragmentStateAdapter {
    public AdapterItensVenda(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public AdapterItensVenda(@NonNull Fragment fragment) {
        super(fragment);
    }

    public AdapterItensVenda(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }
}
