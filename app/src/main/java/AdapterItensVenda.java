import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import br.com.etecia.myapp.AcessoriosFragment;
import br.com.etecia.myapp.LojaFragment;
import br.com.etecia.myapp.VendasFragment;

public abstract class AdapterItensVenda extends FragmentStateAdapter {
    public AdapterItensVenda(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 0:
                return new VendasFragment();
            case 1:
                return new AcessoriosFragment();
            case 2:
                return new LojaFragment();
            default:
                return new VendasFragment();
        }


    }

    public int getItemCount() {
        return 3;
    }
}
