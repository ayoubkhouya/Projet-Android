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
        contactList.add(new Contact("KHOUYA", "Ayoub", "https://pbs.twimg.com/media/ERaPCbdXYAIFG57.jpg"));
        contactList.add(new Contact("NOM", "Zineb", "https://cdn.pixabay.com/photo/2017/03/17/04/07/beautiful-2150881__340.jpg"));
        contactList.add(new Contact("KHOUYA", "Assinat", "https://cdn.pixabay.com/photo/2015/12/25/15/53/person-1107788__340.jpg"));
        contactList.add(new Contact("COURQUIN", "Chloe", "https://cdn.pixabay.com/photo/2017/12/10/17/00/robot-3010309__340.jpg"));
        contactList.add(new Contact("COURQUIN", "Theo", "https://cdn.pixabay.com/photo/2017/09/25/13/12/man-2785071__340.jpg"));
        contactList.add(new Contact("STECCO", "Gerard", "https://cdn.pixabay.com/photo/2015/01/31/18/17/arabs-618749__340.jpg"));
        contactList.add(new Contact("NOM", "Prenom", "https://cdn.pixabay.com/photo/2018/02/09/15/00/girl-3141766__340.jpg"));
        contactList.add(new Contact("NOM", "Prenom", "https://cdn.pixabay.com/photo/2016/03/23/19/37/statue-1275469__340.jpg"));
        contactList.add(new Contact("NOM", "Prenom", "https://cdn.pixabay.com/photo/2018/05/07/10/49/husky-3380550__340.jpg"));
        contactList.add(new Contact("NOM", "Prenom", "https://cdn.pixabay.com/photo/2018/02/13/23/46/wolf-3151876__340.jpg"));
        contactList.add(new Contact("NOM", "Prenom", "https://cdn.pixabay.com/photo/2016/09/27/13/06/sculpture-1698293__340.jpg"));
        contactList.add(new Contact("NOM", "Prenom", "https://cdn.pixabay.com/photo/2015/01/31/08/56/arabs-618308__340.jpg"));
        contactList.add(new Contact("NOM", "Prenom", "https://cdn.pixabay.com/photo/2016/05/30/23/58/barbie-1426039__340.jpg"));
        contactList.add(new Contact("NOM", "Prenom", "https://cdn.pixabay.com/photo/2012/11/28/01/29/man-67467__340.jpg"));
        contactList.add(new Contact("NOM", "Prenom", "https://cdn.pixabay.com/photo/2016/04/12/10/39/portrait-1324072__340.jpg"));
        contactList.add(new Contact("NOM", "Prenom", "https://cdn.pixabay.com/photo/2015/07/28/19/21/person-864804__340.jpg"));
        contactList.add(new Contact("NOM", "Prenom", "https://cdn.pixabay.com/photo/2016/01/10/21/06/eye-1132531__340.jpg"));
        contactList.add(new Contact("NOM", "Prenom", "https://cdn.pixabay.com/photo/2014/07/08/10/47/team-386673__340.jpg"));
        contactList.add(new Contact("NOM", "Prenom", "https://cdn.pixabay.com/photo/2017/12/27/14/02/friends-3042751__340.jpg"));




        // creation d'un adapter
        ContactAdapter adapter = new ContactAdapter(contactList);
        // Notifier Recycle view
        rvContacts.setAdapter(adapter);
        // declarer le layout Manger
        rvContacts.setLayoutManager(new LinearLayoutManager(this));

    }
}