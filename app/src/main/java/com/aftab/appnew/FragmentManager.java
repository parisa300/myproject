package com.aftab.appnew;

import android.app.Activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;


public class FragmentManager {

    public static void showFragment(final Activity activity, final Fragment fragment, int frameLayout_id, boolean addToBackStack, final boolean isAdd) {
        if (!(activity.isDestroyed() || activity.isFinishing())) {
            try {
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
            androidx.fragment.app.FragmentManager fragmentManager = fragmentActivity.getSupportFragmentManager();
                if (fragmentManager != null) {
                    final FragmentTransaction transaction = fragmentManager.beginTransaction();
                   // transaction.setCustomAnimations(R.anim.popup_in, R.anim.fade_out, R.anim.fade_in, R.anim.popup_out);
                    if (isAdd) {
                        transaction.add(frameLayout_id, fragment, fragment.getClass().getName());

                    } else {
                        transaction.replace(frameLayout_id, fragment, fragment.getClass().getName());

                    }

                    if (addToBackStack) {
                        transaction.addToBackStack(fragment.getClass().getName());
                    }
                    transaction.commit();
                }
            } catch (Exception e) {

            }
        }
    }

    public static void showFragmentWhitoutAnim(final Activity activity, final Fragment fragment, int frameLayout_id, boolean addToBackStack, final boolean isAdd) {
        if (!(activity.isDestroyed() || activity.isFinishing())) {
            try {
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
              androidx.fragment.app.FragmentManager fragmentManager = fragmentActivity.getSupportFragmentManager();
                if (fragmentManager != null) {
                    final FragmentTransaction transaction = fragmentManager.beginTransaction();
                    if (isAdd) {
                        transaction.add(frameLayout_id, fragment, fragment.getClass().getName());

                    } else {
                        transaction.replace(frameLayout_id, fragment, fragment.getClass().getName());

                    }

                    if (addToBackStack) {
                        transaction.addToBackStack(fragment.getClass().getName());
                    }
                    transaction.commit();
                }
            } catch (Exception e) {

            }
        }
    }

    public static void showChildFragmentWhitoutAnim(final Fragment originFragment, final Fragment destinationFragment, boolean addToBackStack, final boolean isAdd, int framelayout_id) {
        if (originFragment.isVisible()) {
            try {

            androidx.fragment.app.FragmentManager fragmentManager = originFragment.getChildFragmentManager();
                if (fragmentManager != null) {
                    final FragmentTransaction transaction = fragmentManager.beginTransaction();
                    if (isAdd) {
                        transaction.add(framelayout_id, destinationFragment, destinationFragment.getClass().getName());

                    } else {
                        transaction.replace(framelayout_id, destinationFragment, destinationFragment.getClass().getName());

                    }

                    if (addToBackStack) {
                        transaction.addToBackStack(destinationFragment.getClass().getName());
                    }
                    transaction.commit();
                }
            } catch (Exception e) {

            }
        }
    }


    public static void showChildFragment(final Fragment originFragment, final Fragment destinationFragment, int framelayout_id, boolean addToBackStack, final boolean isAdd) {
        if (originFragment.isVisible()) {
            try {

               androidx.fragment.app.FragmentManager fragmentManager = originFragment.getChildFragmentManager();

                if (fragmentManager != null) {
                    final FragmentTransaction transaction = fragmentManager.beginTransaction();
              //      transaction.setCustomAnimations(R.anim.popup_in, R.anim.fade_out, R.anim.fade_in, R.anim.popup_out);
                    if (isAdd) {
                        transaction.add(framelayout_id, destinationFragment, destinationFragment.getClass().getName());

                    } else {
                        transaction.replace(framelayout_id, destinationFragment, destinationFragment.getClass().getName());

                    }

                    if (addToBackStack) {
                        transaction.addToBackStack(destinationFragment.getClass().getName());
                    }
                    transaction.commit();
                }
            } catch (Exception e) {

            }
        }
    }

    public static void removeFragment(final Activity activity, final Fragment fragment) {
        if (!(activity.isDestroyed() || activity.isFinishing())) {
            try {
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
               androidx.fragment.app.FragmentManager fragmentManager = fragmentActivity.getSupportFragmentManager();
                if (fragmentManager != null) {
                    final FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.remove(fragment);

                    transaction.commit();
                }
            } catch (Exception e) {

            }
        }
    }


}
