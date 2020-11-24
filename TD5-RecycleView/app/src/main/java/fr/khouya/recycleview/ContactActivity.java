package fr.khouya.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import fr.khouya.recycleview.controllers.ContactAdapter;
import fr.khouya.recycleview.modeles.Contact;

public class ContactActivity extends AppCompatActivity {

    List<Contact> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        // Pointer vers le RecyleView
        RecyclerView rvContacts = findViewById(R.id.rvContacts);

        // Initialisation des contacts
        contactList.add(new Contact("KHOUYA", "Ayoub"));
        contactList.add(new Contact("KHOUYA", "Zineb"));
        contactList.add(new Contact("KHOUYA", "Assinat"));
        contactList.add(new Contact("COURQUIN", "Chloe"));
        contactList.add(new Contact("COURQUIN", "Theo"));
        contactList.add(new Contact("STECCO", "Gerard"));
        for (int i = 0; i < 10; i++) {
            contactList.add(new Contact("Contact " + i, "Prenom " + i));
        }

        // creation d'un adapter
        ContactAdapter adapter = new ContactAdapter(contactList);
        // Notifier Recycle view
        rvContacts.setAdapter(adapter);
        // declarer le layout Manger
        rvContacts.setLayoutManager(new LinearLayoutManager(this));

    }
}