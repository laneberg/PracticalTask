package com.example.practicaltaskapp.presenter

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.practicaltaskapp.R
import com.example.practicaltaskapp.ui.fragments.ChatsFragment
import com.example.practicaltaskapp.ui.fragments.ContactsFragment
import com.example.practicaltaskapp.ui.fragments.FilesFragment
import com.example.practicaltaskapp.ui.fragments.ProfileFragment
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem

class AppDrawer(val mainActivity: AppCompatActivity, private val toolbar: Toolbar) {
    private lateinit var drawer: Drawer
    private lateinit var header: AccountHeader

    fun create() {
//        initHeader()
        initDrawer()
    }

//    private fun initHeader() {
//        header = AccountHeaderBuilder()
//            .withActivity(mainActivity)
//            .withHeaderBackground(R.drawable.header)
//            .addProfiles(
//                ProfileDrawerItem()
//                    .withName("Emma Brown")
//                    .withEmail("emma.brown@gmail.com")
//            ).build()
//    }

    private fun initDrawer() {
        drawer = DrawerBuilder()
            .withActivity(mainActivity)
            .withToolbar(toolbar)
            .withSelectedItem(-1)
//            .withAccountHeader(header)
            .addDrawerItems(

                PrimaryDrawerItem().withIdentifier(0)
                    .withIconTintingEnabled(false)
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_menu_icon),

                PrimaryDrawerItem().withIdentifier(1)
                    .withIconTintingEnabled(true)
                    .withName("Chats")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_menu_chats),
                PrimaryDrawerItem().withIdentifier(2)
                    .withIconTintingEnabled(true)
                    .withName("Profile")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_menu_profile),
                PrimaryDrawerItem().withIdentifier(3)
                    .withIconTintingEnabled(true)
                    .withName("Files")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_menu_files),
                PrimaryDrawerItem().withIdentifier(4)
                    .withIconTintingEnabled(true)
                    .withName("Contacts")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_menu_contacts),
                PrimaryDrawerItem().withIdentifier(5)
                    .withIconTintingEnabled(true)
                    .withName("Sing out")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_menu_singout)
            ).withOnDrawerItemClickListener(object : Drawer.OnDrawerItemClickListener {
                override fun onItemClick(
                    view: View?,
                    position: Int,
                    drawerItem: IDrawerItem<*>
                ): Boolean {
                    when (position) {
                        0 -> mainActivity.supportFragmentManager.beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.dataContainer, ChatsFragment()).commit()
                        1 -> mainActivity.supportFragmentManager.beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.dataContainer, ChatsFragment()).commit()
                        2 -> mainActivity.supportFragmentManager.beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.dataContainer, ProfileFragment()).commit()
                        3 -> mainActivity.supportFragmentManager.beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.dataContainer, FilesFragment()).commit()
                        4 -> mainActivity.supportFragmentManager.beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.dataContainer, ContactsFragment()).commit()
                    }
                    return false
                }
            }).build()
    }

}