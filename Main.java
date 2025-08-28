import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.lang.*;
import java.util.*;
import classes.*;
import fileio.*;
import javax.swing.*;
public class Main {
    static Hospital h = new Hospital();
    //static FileReadWriteDemo file_read = new FileReadWriteDemo();
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        new PatientFream();

    }

    public static class PatientFream extends JFrame implements ActionListener {
        private JButton pat, Doc, Ambu , Stf, Emg_pat , pharma, Exit1;
        private JPanel panel1;
        private Font myFont;

        public PatientFream() {
            super("Hospital Management System");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);

            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            pat = new JButton("1. Patient Management");
            pat.setFont(myFont);
            pat.setBounds(350, 125, 300, 50);
            pat.setBackground(new Color(0xA9E5EF));
            pat.addActionListener(this);
            panel1.add(pat);

            Doc = new JButton("Doctor Management");
            Doc.setFont(myFont);
            Doc.setBounds(350, 200, 300, 50);
            Doc.setBackground(new Color(0xA9E5EF));
            Doc.addActionListener(this);
            panel1.add(Doc);

            Ambu= new JButton("Ambulance Section");
            Ambu.setFont(myFont);
            Ambu.setBounds(350, 275, 300, 50);
            Ambu.setBackground(new Color(0xA9E5EF));
            Ambu.addActionListener(this);
            panel1.add(Ambu;


            Stf = new JButton("Stuff Management Section");
            Stf.setFont(myFont);
            Stf.setBounds(350, 350, 300, 50);
            Stf.setBackground(new Color(0xA9E5EF));
            Stf.addActionListener(this);
            panel1.add(Stf);


            Emg_pat = new JButton("Emergency Unit");
            Emg_pat.setFont(myFont);
            Emg_pat.setBounds(350, 425, 300, 50);
            Emg_pat.setBackground(new Color(0xA9E5EF));
            Emg_pat.addActionListener(this);
            panel1.add(Emg_pat);

            pharma = new JButton("Medicine Center");
            pharma.setFont(myFont);
            pharma.setBounds(350, 500, 300, 50);
            pharma.setBackground(new Color(0xA9E5EF));
            pharma.addActionListener(this);
            panel1.add(pharma);

            Exit1 = new JButton("Exit");
            Exit1.setFont(myFont);
            Exit1.setBounds(350, 625, 300, 50);
            Exit1.setBackground(new Color(0xD70303));
            Exit1.addActionListener(this);
            panel1.add(Exit1);

            this.add(panel1);
            this.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();

        }
        static class Patfrem extends JFrame implements ActionListener {

            private JButton addpat, revpat, SowAll, srcpat, back;
            private JPanel panel1;
            private Font myFont;
            private int opt1;

            public Patientfrem() {
                super("Patient Management");
                this.setSize(1000, 800);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setLayout(null);
                myFont = new Font("Cambria", Font.PLAIN, 18);
                panel1 = new JPanel();
                panel1.setBounds(0, 0, 1000, 800);
                panel1.setLayout(null);
                panel1.setBackground(new Color(250, 237, 205));

                addpat = new JButton("Insert New Patient");
                addpat.setFont(myFont);
                addpat.setBounds(350, 125, 300, 50);
                addpat.setBackground(new Color(0xA9E5EF));
                addpat.addActionListener(this);
                panel1.add(addpat);


                revpat = new JButton("Remove Existing Patient");
                revpat.setFont(myFont);
                revpat.setBounds(350, 225, 300, 50);
                revpat.setBackground(new Color(0xA9E5EF));
                revpat.addActionListener(this);
                panel1.add(revpat);

                SowAll = new JButton("Show All Patient");
                SowAll.setFont(myFont);
                SowAll.setBounds(350, 325, 300, 50);
                SowAll.setBackground(new Color(0xA9E5EF));
                SowAll.addActionListener(this);
                panel1.add(SowAll);

                srcpat = new JButton("Search Patient");
                srcpat.setFont(myFont);
                srcpat.setBounds(350, 425, 300, 50);
                srcpat.setBackground(new Color(0xA9E5EF));
                srcpat.addActionListener(this);
                panel1.add(srcpat);

                back = new JButton("Go Back");
                back.setFont(myFont);
                back.setBounds(350, 525, 300, 50);
                back.setBackground(new Color(0xA9E5EF));
                back.addActionListener(this);
                panel1.add(back);


                this.add(panel1);
                this.setVisible(true);


            }


            public void actionPerformed(ActionEvent ae) {
                String command = ae.getActionCommand();
            }

            static class addpatFr extends JFrame implements ActionListener {
                private JTextField patName, patID,patDiseases,patSex,patAdmitstatus,patAge,patBirthYear,patNIDNumber;
                private JButton AddNewpat, back;
                private JPanel panel1;
                private Font myFont;
                private JLabel patname, patid,patdiseases,patsex,patadmitstatus,patage,patbirthYear,patnidnumber;

                public addpatFr() {
                    super("Insert Doctor");
                    this.setSize(1000, 1000);
                    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    this.setLayout(null);


                    myFont = new Font("Times new Roman", Font.PLAIN, 18);
                    panel1 = new JPanel();
                    panel1.setBounds(0, 0, 1000, 950);
                    panel1.setLayout(null);
                    panel1.setBackground(new Color(250, 237, 205));


                    patName = new JTextField("");
                    patName.setFont(myFont);
                    patName.setBounds(250, 100, 550, 50);
                    patName.add(patName);

                    patID = new JTextField("Patient ID");
                    patID.setFont(myFont);
                    patID.setBounds(250, 175, 550, 50);
                    patID.add(patID);

                    patSex = new JTextField("Patient Sex");
                    patSex.setFont(myFont);
                    patSex.setBounds(250, 250, 550, 50);
                    panel1.add(patSex);

                    patDiseases = new JTextField("Patient Disease");
                    patDiseases.setFont(myFont);
                    patDiseases.setBounds(250, 325, 200, 50);
                    panel1.add(patDiseases);

                    patAdmitstatus = new JTextField("Patient Admit Status")
                    patAdmitstatus.setBounds(250, 400, 200, 50);
                    panel1.add(patAdmitstatus);

                    patBirthYear = new JTextField("Patient Birth Year");
                    patBirthYear.setFont(myFont);
                    patBirthYear.setBounds(250, 475, 200, 50);
                    panel1.add(patBirthYear);

                    patAge = new JTextField("Patient AGE");
                    patAge.setFont(myFont);
                    patAge.setBounds(250, 550, 200, 50);
                    panel1.add(patAge);

                    patNIDNumber = new JTextField("Enter Patient NID Number");
                    patNIDNumber.setFont(myFont);
                    patNIDNumber.setBounds(250, 625, 200, 50);
                    panel1.add(patNIDNumber);

                    AddNewpat = new JButton("Insert New Patient");
                    AddNewpat.setFont(myFont);
                    AddNewpat.setBounds(725, 725, 200, 70);
                    AddNewpat.setBackground(new Color(0x058CA2));
                    AddNewpat.addActionListener(this);
                    panel1.add(AddNewpat);

                    patname = new JLabel("");
                    patname.setFont(myFont);
                    patname.setBounds(250, 100, 550, 50);
                    panel1.add( patname);

                    patid = new JLabel("Patient ID");
                    patid.setFont(myFont);
                    patid.setBounds(250, 175, 550, 50);
                    panel1..add(patid);

                    patsex = new JLabel("Patient Sex");
                    patsex.setFont(myFont);
                    patsex.setBounds(250, 250, 550, 50);
                    panel1..add(patsex);

                    patdiseases = new JLabel("Patient Disease");
                    patdiseases.setFont(myFont);
                    patdiseases.setBounds(250, 325, 550, 50);
                    panel1.add(patdiseases);

                    patadmitstatus = new JLabel("Patient Admit Status");
                    patadmitstatus.setFont(myFont);
                    patadmitstatus.setBounds(250, 400, 200, 50);
                    panel1.add(patadmitstatus);

                    patage = new JLabel("Patient AGE");
                    patage.setFont(myFont);
                    patage.setBounds(250, 475, 550, 50);
                    panel1..add(patage);

                    patbirthYear = new JLabel("Patient Birth Year");
                    patbirthYear.setFont(myFont);
                    patbirthYear.setBounds(250, 550, 200, 50);
                    panel1.add(patbirthYear);

                    patnidnumber = new JLabel("Enter Patient NID Number");
                    patnidnumber.setFont(myFont);
                    patnidnumber.setBounds(250, 625, 200, 50);
                    panel1.add(patnidnumber);


                    back = new JButton("Back");
                    back.setFont(myFont);
                    back.setBounds(725, 725, 200, 70);
                    back.setBackground(new Color(0x058CA2));
                    back.addActionListener(this);
                    panel1.add(back);


                    this.add(panel1);
                    this.setVisible(true);


                }



                static class Docfrem extends JFrame implements ActionListener {

                    private JButton addDoc, revDoc, SowAll, srcDoc, back;
                    private JPanel panel1;
                    private Font myFont;
                    private int opt1;

                    public Docfrem() {
                        super("Doctor Management");
                        this.setSize(1000, 800);
                        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                        this.setLayout(null);
                        myFont = new Font("Cambria", Font.PLAIN, 18);
                        panel1 = new JPanel();
                        panel1.setBounds(0, 0, 1000, 800);
                        panel1.setLayout(null);
                        panel1.setBackground(new Color(250, 237, 205));

                        addDoc = new JButton("Insert New Doctor");
                        addDoc.setFont(myFont);
                        addDoc.setBounds(350, 125, 300, 50);
                        addDoc.setBackground(new Color(0xA9E5EF));
                        addDoc.addActionListener(this);
                        panel1.add(addDoc);


                        revDoc = new JButton("Remove Existing Doctor");
                        revDoc.setFont(myFont);
                        revDoc.setBounds(350, 225, 300, 50);
                        revDoc.setBackground(new Color(0xA9E5EF));
                        revDoc.addActionListener(this);
                        panel1.add(revDoc);

                        SowAll = new JButton("Show All Doctor");
                        SowAll.setFont(myFont);
                        SowAll.setBounds(350, 325, 300, 50);
                        SowAll.setBackground(new Color(0xA9E5EF));
                        SowAll.addActionListener(this);
                        panel1.add(SowAll);

                        srcDoc = new JButton("Search Doctor");
                        srcDoc.setFont(myFont);
                        srcDoc.setBounds(350, 425, 300, 50);
                        srcDoc.setBackground(new Color(0xA9E5EF));
                        srcDoc.addActionListener(this);
                        panel1.add(srcDoc);

                        back = new JButton("Go Back");
                        back.setFont(myFont);
                        back.setBounds(350, 525, 300, 50);
                        back.setBackground(new Color(0xA9E5EF));
                        back.addActionListener(this);
                        panel1.add(back);


                        this.add(panel1);
                        this.setVisible(true);


                    }

                    public void actionPerformed(ActionEvent ae) {
                        String command = ae.getActionCommand();
                    }


                    static class addDocFr extends JFrame implements ActionListener {
                        private JTextField DocName, DocId,DocRoom,DocQualification,DocSpecialist,DocAppoinment;
                        private JButton AddNewDoc, back;
                        private JPanel panel1;
                        private Font myFont;
                        private JLabel  Docname, Docid ,Docroom,Docqualification,Docspecialist,Docappoinment;

                        public addDocFr() {
                            super("Insert Doctor");
                            this.setSize(1000, 1000);
                            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                            this.setLayout(null);


                            myFont = new Font("Times new Roman", Font.PLAIN, 18);
                            panel1 = new JPanel();
                            panel1.setBounds(0, 0, 1000, 800);
                            panel1.setLayout(null);
                            panel1.setBackground(new Color(250, 237, 205));


                            DocName = new JTextField("");
                            DocName.setFont(myFont);
                            DocName.setBounds(250, 100, 550, 50);
                            DocName.add(DocName);

                            DocId = new JTextField("");
                            DocId.setFont(myFont);
                            DocId.setBounds(250, 200, 550, 50);
                            panel1.add(DocId);

                            DocRoom = new JTextField("");
                            DocRoom.setFont(myFont);
                            DocRoom.setBounds(250, 400, 550, 50);
                            panel1.add(DocRoom);

                            DocQualification = new JTextField("Doctor Speciality Divission");
                            DocQualification.setFont(myFont);
                            DocQualification.setBounds(250, 500, 200, 50);
                            panel1.add(DocQualification);

                            DocSpecialist = new JTextField("Doctor Speciality Divission");
                            DocSpecialist.setFont(myFont);
                            DocSpecialist.setBounds(250, 600, 200, 50);
                            panel1.add(DocSpecialist);

                            DocAppoinment = new JTextField("Enter Doctor Appoinment Time");
                            DocAppoinment.setFont(myFont);
                            DocAppoinment.setBounds(250, 700, 200, 50);
                            panel1.add(DocAppoinment);

                            AddNewDoc = new JButton("Doctor Qualification Status");
                            AddNewDoc.setFont(myFont);
                            AddNewDoc.setBounds(850, 850, 200, 70);
                            AddNewDoc.setBackground(new Color(0x058CA2));
                            AddNewDoc.addActionListener(this);
                            panel1.add(AddNewDoc);

                            Docname = new JLabel("");
                            Docname.setFont(myFont);
                            Docname.setBounds(250, 100, 550, 50);
                            Docname.add(DocName);

                            Docid = new JLabel("");
                            Docid.setFont(myFont);
                            Docid.setBounds(250, 200, 550, 50);
                            panel1.add(Docid);

                            Docroom = new JLabel("");
                            Docroom.setFont(myFont);
                            Docroom.setBounds(250, 400, 550, 50);
                            panel1.add(Docroom);

                            Docqualification = new JLabel("Doctor Speciality Divission");
                            Docqualification.setFont(myFont);
                            Docqualification.setBounds(250, 500, 200, 50);
                            panel1.add(Docqualification);

                            Docspecialist = new JLabel("Doctor Speciality Divission");
                            Docspecialist.setFont(myFont);
                            Docspecialist.setBounds(250, 600, 200, 50);
                            panel1.add(Docspecialist);

                            Docappoinment = new JLabel("Enter Doctor Appointment Time");
                            Docappoinment.setFont(myFont);
                            Docappoinment.setBounds(250, 700, 200, 50);
                            panel1.add(Docappoinment);


                            back = new JButton("Back");
                            back.setFont(myFont);
                            back.setBounds(400, 800, 200, 70);
                            back.setBackground(new Color(0x058CA2));
                            back.addActionListener(this);
                            panel1.add(back);


                            this.add(panel1);
                            this.setVisible(true);


                        }


                        public void actionPerformed(ActionEvent ae) {
                            String command = ae.getActionCommand();
                        }

                        static class Stffrem extends JFrame implements ActionListener {

                            private JButton addStf, revStf, SowAll, srcStf, back;
                            private JPanel panel1;
                            private Font myFont;
                            private int opt1;

                            public Staffrem() {
                                super("Staff  Management");
                                this.setSize(1000, 800);
                                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                this.setLayout(null);
                                myFont = new Font("Cambria", Font.PLAIN, 18);
                                panel1 = new JPanel();
                                panel1.setBounds(0, 0, 1000, 800);
                                panel1.setLayout(null);
                                panel1.setBackground(new Color(250, 237, 205));

                                addStf = new JButton("Insert New Staff");
                                addStf.setFont(myFont);
                                addStf.setBounds(350, 125, 300, 50);
                                addStf.setBackground(new Color(0xA9E5EF));
                                addStf.addActionListener(this);
                                panel1.add(addStf);


                                revStf = new JButton("Remove Existing Staff");
                                revStf.setFont(myFont);
                                revStf.setBounds(350, 225, 300, 50);
                                revStf.setBackground(new Color(0xA9E5EF));
                                revStf.addActionListener(this);
                                panel1.add(revStf);

                                SowAll = new JButton("Show All Staff");
                                SowAll.setFont(myFont);
                                SowAll.setBounds(350, 325, 300, 50);
                                SowAll.setBackground(new Color(0xA9E5EF));
                                SowAll.addActionListener(this);
                                panel1.add(SowAll);

                                srcStf = new JButton("Search Staff");
                                srcStf.setFont(myFont);
                                srcStf.setBounds(350, 425, 300, 50);
                                srcStf.setBackground(new Color(0xA9E5EF));
                                srcStf.addActionListener(this);
                                panel1.add(srcStf);

                                back = new JButton("Go Back");
                                back.setFont(myFont);
                                back.setBounds(350, 525, 300, 50);
                                back.setBackground(new Color(0xA9E5EF));
                                back.addActionListener(this);
                                panel1.add(back);


                                this.add(panel1);
                                this.setVisible(true);


                            }

                            public void actionPerformed(ActionEvent ae) {
                                String command = ae.getActionCommand();
                            }


                            static class addStaffFr extends JFrame implements ActionListener {
                                private JTextField staff_ID,staff_Name,staff_Post,staff_Salary,staff_PhoneNumber;
                                private JButton addNewstf, back;
                                private JPanel panel1;
                                private Font myFont;
                                private JLabel  staff_id,staff_name,staff_post,staff_salary,staff_phoneNumber;

                                public addStfFr() {
                                    super("Insert STAFF");
                                    this.setSize(1000, 800);
                                    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                    this.setLayout(null);


                                    myFont = new Font("Times new Roman", Font.PLAIN, 18);
                                    panel1 = new JPanel();
                                    panel1.setBounds(0, 0, 1000, 800);
                                    panel1.setLayout(null);
                                    panel1.setBackground(new Color(250, 237, 205));


                                    staff_ID = new JTextField("Enter Staff ID");
                                    staff_ID.setFont(myFont);
                                    staff_ID.setBounds(250, 100, 550, 50);
                                    staff_ID.add(staff_ID);

                                    staff_Name = new JTextField("Enter Staff Name");
                                    staff_Name.setFont(myFont);
                                    staff_Name.setBounds(250, 200, 550, 50);
                                    panel1.add(staff_Name);

                                    staff_Post = new JTextField("Post of Stuff");
                                    staff_Post.setFont(myFont);
                                    staff_Post.setBounds(250, 300, 550, 50);
                                    panel1.add(staff_Post);

                                    staff_Salary = new JTextField("Enter the Salary");
                                    staff_Salary.setFont(myFont);
                                    staff_Salary.setBounds(250, 300, 550, 50);
                                    panel1.add(staff_Salary);


                                    staff_PhoneNumber = new JTextField("Enter Patient Mobile No.");
                                    staff_PhoneNumber.setFont(myFont);
                                    staff_PhoneNumber.setBounds(250,  150, 200, 50);
                                    panel1.add(staff_PhoneNumber);

                                    addNewstf = new JButton("Add New Stuff");
                                    addNewstf.setFont(myFont);
                                    addNewstf.setBounds(400, 400, 200, 70);
                                    addNewstf.setBackground(new Color(0x058CA2));
                                    addNewstf.addActionListener(this);
                                    panel1.add(addNewstf);

                                    staff_id = new JLabel("Enter Staff ID");
                                    staff_id.setFont(myFont);
                                    staff_id.setBounds(250,  50, 200, 50);
                                    panel1.add(staff_id);

                                    staff_name = new JLabel("Enter Staff Name");
                                    staff_name.setFont(myFont);
                                    staff_name.setBounds(250,  50, 200, 50);
                                    panel1.add(staff_name);

                                    staff_post = new JLabel("Post of Stuff");
                                    staff_post.setFont(myFont);
                                    staff_post.setBounds(250,  50, 200, 50);
                                    panel1.add(staff_post);




                                    staff_phoneNumber = new JLabel("Enter Staff Mobile no.");
                                    staff_phoneNumber.setFont(myFont);
                                    staff_phoneNumber.setBounds(250,  50, 200, 50);
                                    panel1.add(staff_phoneNumber);



                                    staff_salary = new JLabel("Enter the Salary");
                                    staff_salary.setFont(myFont);
                                    staff_salary.setBounds(250,  50, 200, 50);
                                    panel1.add(staff_salary);


                                    back = new JButton("Back");
                                    back.setFont(myFont);
                                    back.setBounds(400, 500, 200, 70);
                                    back.setBackground(new Color(0x058CA2));
                                    back.addActionListener(this);
                                    panel1.add(back);


                                    this.add(panel1);
                                    this.setVisible(true);


                                }


                                public void actionPerformed(ActionEvent ae) {
                                    String command = ae.getActionCommand();
                                }



                                static class Ambufrem extends JFrame implements ActionListener {

                                    private JButton addAmbu, revAmbu, SowAll, srcAmbu, back;
                                    private JPanel panel1;
                                    private Font myFont;
                                    private int opt1;

                                    public Docfrem() {
                                        super("Ambulance Management");
                                        this.setSize(1000, 800);
                                        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                        this.setLayout(null);
                                        myFont = new Font("Cambria", Font.PLAIN, 18);
                                        panel1 = new JPanel();
                                        panel1.setBounds(0, 0, 1000, 800);
                                        panel1.setLayout(null);
                                        panel1.setBackground(new Color(250, 237, 205));

                                        addAmbu = new JButton("Insert New Ambulance ");
                                        addAmbu.setFont(myFont);
                                        addAmbu.setBounds(350, 125, 300, 50);
                                        addAmbu.setBackground(new Color(0xA9E5EF));
                                        addAmbu.addActionListener(this);
                                        panel1.add(addAmbu);


                                        revAmbu= new JButton("Remove Existing Ambulance ");
                                        revAmbu.setFont(myFont);
                                        revAmbu.setBounds(350, 225, 300, 50);
                                        revAmbu.setBackground(new Color(0xA9E5EF));
                                        revAmbu.addActionListener(this);
                                        panel1.add(revAmbu);

                                        SowAll = new JButton("Show All Ambulance ");
                                        SowAll.setFont(myFont);
                                        SowAll.setBounds(350, 325, 300, 50);
                                        SowAll.setBackground(new Color(0xA9E5EF));
                                        SowAll.addActionListener(this);
                                        panel1.add(SowAll);

                                        srcAmbu = new JButton("Search Ambulance ");
                                        srcAmbu.setFont(myFont);
                                        srcAmbu.setBounds(350, 425, 300, 50);
                                        srcAmbu.setBackground(new Color(0xA9E5EF));
                                        srcAmbu.addActionListener(this);
                                        panel1.add(srcAmbu);

                                        back = new JButton("Go Back");
                                        back.setFont(myFont);
                                        back.setBounds(350, 525, 300, 50);
                                        back.setBackground(new Color(0xA9E5EF));
                                        back.addActionListener(this);
                                        panel1.add(back);


                                        this.add(panel1);
                                        this.setVisible(true);


                                    }

                                    public void actionPerformed(ActionEvent ae) {
                                        String command = ae.getActionCommand();
                                    }


                                    static class addAmbuFr extends JFrame implements ActionListener {
                                        private JTextField Driver_Name, Phone_Number,Id,Ambulance_Num;
                                        private JButton AddNewAmbu, back;
                                        private JPanel panel1;
                                        private Font myFont;
                                        private JLabel  driver_name, phone_number ,id,ambulance_num;

                                        public addAmbuFr() {
                                            super("Add New Ambulance");
                                            this.setSize(1000, 1000);
                                            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                            this.setLayout(null);


                                            myFont = new Font("Times new Roman", Font.PLAIN, 18);
                                            panel1 = new JPanel();
                                            panel1.setBounds(0, 0, 1000, 800);
                                            panel1.setLayout(null);
                                            panel1.setBackground(new Color(250, 237, 205));


                                            Driver_Name = new JTextField("Enter the Driver's Name");
                                            Driver_Name.setFont(myFont);
                                            Driver_Name.setBounds(250, 100, 550, 50);
                                            Driver_Name.add(Driver_Name);

                                            Phone_Number = new JTextField("Provide Mobile No.");
                                            Phone_Number.setFont(myFont);
                                            Phone_Number.setBounds(250, 200, 550, 50);
                                            panel1.add(Phone_Number);

                                            Id = new JTextField("Enter Your ID");
                                            Id.setFont(myFont);
                                            Id.setBounds(250, 400, 550, 50);
                                            panel1.add(Id);

                                            Ambulance_Num = new JTextField("Ambulance Number");
                                            Ambulance_Num.setFont(myFont);
                                            Ambulance_Num.setBounds(250, 400, 550, 50);
                                            panel1.add(Ambulance_Num);


                                            AddNewAmbu = new JButton("Add New Ambulance");
                                            AddNewAmbu.setFont(myFont);
                                            AddNewAmbu.setBounds(850, 850, 200, 70);
                                            AddNewAmbu.setBackground(new Color(0x058CA2));
                                            AddNewAmbu.addActionListener(this);
                                            panel1.add(AddNewAmbu);

                                            driver_name = new JLabel("Enter Driver's Name");
                                            driver_name.setFont(myFont);
                                            driver_name.setBounds(250, 700, 200, 50);
                                            panel1.add(driver_name);

                                            phone_number = new JLabel("Provide Mobile No.");
                                            phone_number.setFont(myFont);
                                            phone_number.setBounds(250, 700, 200, 50);
                                            panel1.add(phone_number);

                                            id = new JLabel("Enter Your ID");
                                            id.setFont(myFont);
                                            id.setBounds(250, 700, 200, 50);
                                            panel1.add(id);

                                            ambulance_num = new JLabel("Ambulance Number");
                                            ambulance_num.setFont(myFont);
                                            ambulance_num.setBounds(250, 700, 200, 50);
                                            panel1.add(ambulance_num);

                                            back = new JButton("Back");
                                            back.setFont(myFont);
                                            back.setBounds(400, 800, 200, 70);
                                            back.setBackground(new Color(0x058CA2));
                                            back.addActionListener(this);
                                            panel1.add(back);


                                            this.add(panel1);
                                            this.setVisible(true);


                                        }

                                        static class Emg_patfrem extends JFrame implements ActionListener {

                                            private JButton addEmg_pat, revEmg_pat, SowAll, srcEmg_pat, back;
                                            private JPanel panel1;
                                            private Font myFont;
                                            private int opt1;

                                            public Docfrem() {
                                                super("Emergency Patient Management");
                                                this.setSize(1000, 800);
                                                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                                this.setLayout(null);


                                                myFont = new Font("Cambria", Font.PLAIN, 18);
                                                panel1 = new JPanel();
                                                panel1.setBounds(0, 0, 1000, 800);
                                                panel1.setLayout(null);
                                                panel1.setBackground(new Color(250, 237, 205));

                                                addEmg_pat = new JButton("Insert New Emergency Patient");
                                                addEmg_pat.setFont(myFont);
                                                addEmg_pat.setBounds(350, 125, 300, 50);
                                                addEmg_pat.setBackground(new Color(0xA9E5EF));
                                                addEmg_pat.addActionListener(this);
                                                panel1.add(addEmg_pat);


                                                revEmg_pat = new JButton("Remove Existing Emergency Patient");
                                                revEmg_pat.setFont(myFont);
                                                revEmg_pat.setBounds(350, 225, 300, 50);
                                                revEmg_pat.setBackground(new Color(0xA9E5EF));
                                                revEmg_pat.addActionListener(this);
                                                revEmg_pat.add(revEmg_pat);

                                                SowAll = new JButton("Show Emergency Patient");
                                                SowAll.setFont(myFont);
                                                SowAll.setBounds(350, 325, 300, 50);
                                                SowAll.setBackground(new Color(0xA9E5EF));
                                                SowAll.addActionListener(this);
                                                panel1.add(SowAll);

                                                srcEmg_pat = new JButton("Search Emergency Patient");
                                                srcEmg_pat.setFont(myFont);
                                                srcEmg_pat.setBounds(350, 425, 300, 50);
                                                srcEmg_pat.setBackground(new Color(0xA9E5EF));
                                                srcEmg_pat.addActionListener(this);
                                                panel1.add(srcEmg_pat);

                                                back = new JButton("Go Back");
                                                back.setFont(myFont);
                                                back.setBounds(350, 525, 300, 50);
                                                back.setBackground(new Color(0xA9E5EF));
                                                back.addActionListener(this);
                                                panel1.add(back);


                                                this.add(panel1);
                                                this.setVisible(true);


                                            }

                                            public void actionPerformed(ActionEvent ae) {
                                                String command = ae.getActionCommand();
                                            }

                                            static class addEmg_patFr extends JFrame implements ActionListener {
                                                private JTextField EmPatName, EmPatID,EmPatPhoneNumber,EmPatAddress,EmpatBloodGroup,EmPatProbType;
                                                private JButton AddNewEmg_pat, back;
                                                private JPanel panel1;
                                                private Font myFont;
                                                private JLabel  empatname, empatid ,empataddress,empatbloodgroup,empatprobtype,patphonenumber;

                                                public addEmg_patFr() {
                                                    super("Add Emergency Patient");
                                                    this.setSize(1000, 1000);
                                                    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                                    this.setLayout(null);


                                                    myFont = new Font("Times new Roman", Font.PLAIN, 18);
                                                    panel1 = new JPanel();
                                                    panel1.setBounds(0, 0, 1000, 800);
                                                    panel1.setLayout(null);
                                                    panel1.setBackground(new Color(250, 237, 205));


                                                    EmPatName = new JTextField("Enter Patient Name");
                                                    EmPatName.setFont(myFont);
                                                    EmPatName.setBounds(250, 100, 550, 50);
                                                    EmPatName.add(EmPatName);

                                                    EmPatID = new JTextField("Enter Patient's ID");
                                                    EmPatID.setFont(myFont);
                                                    EmPatID.setBounds(250, 200, 550, 50);
                                                    panel1.add(EmPatID);

                                                    EmPatPhoneNumber = new JTextField("Enter Mobile Number");
                                                    EmPatPhoneNumber.setFont(myFont);
                                                    EmPatPhoneNumber.setBounds(250, 400, 550, 50);
                                                    panel1.add(EmPatPhoneNumber);

                                                    EmPatAddress = new JTextField("Give Address");
                                                    EmPatAddress.setFont(myFont);
                                                    EmPatAddress.setBounds(250, 500, 200, 50);
                                                    panel1.add(EmPatAddress);

                                                    EmpatBloodGroup = new JTextField("Blood Group");
                                                    EmpatBloodGroup.setFont(myFont);
                                                    EmpatBloodGroup.setBounds(250, 600, 200, 50);
                                                    panel1.add(EmpatBloodGroup);

                                                    EmPatProbType = new JTextField("Enter Your Problem");
                                                    EmPatProbType.setFont(myFont);
                                                    EmPatProbType.setBounds(250, 700, 200, 50);
                                                    panel1.add(EmPatProbType);

                                                    AddNewEmg_pat = new JButton("Add New Emergency Patient");
                                                    AddNewEmg_pat.setFont(myFont);
                                                    AddNewEmg_pat.setBounds(850, 850, 200, 70);
                                                    AddNewEmg_pat.setBackground(new Color(0x058CA2));
                                                    AddNewEmg_pat.addActionListener(this);
                                                    panel1.add(AddNewEmg_pat);

                                                    empatname = new JLabel("Enter Patient Name");
                                                    empatname.setFont(myFont);
                                                    empatname.setBounds(250, 100, 550, 50);
                                                    empatname.add(empatname);

                                                    empatid = new JLabel("Enter Patient's ID");
                                                    empatid.setFont(myFont);
                                                    empatid.setBounds(250, 200, 550, 50);
                                                    panel1.add(empatid);

                                                    empataddress = new JLabel("Give Address");
                                                    empataddress.setFont(myFont);
                                                    empataddress.setBounds(250, 500, 200, 50);
                                                    panel1.add(empataddress);

                                                    empatbloodgroup = new JLabel("Blood Group");
                                                    empatbloodgroup.setFont(myFont);
                                                    empatbloodgroup.setBounds(250, 600, 200, 50);
                                                    panel1.add(empatbloodgroup);

                                                    empatprobtype = new JLabel("Enter Your Problem");
                                                    empatprobtype.setFont(myFont);
                                                    empatprobtype.setBounds(250, 700, 200, 50);
                                                    panel1.add(empatprobtype);


                                                    patphonenumber = new JLabel("Enter Mobile Number");
                                                    patphonenumber.setFont(myFont);
                                                    patphonenumber.setBounds(250, 700, 200, 50);
                                                    panel1.add(patphonenumber);


                                                    back = new JButton("Back");
                                                    back.setFont(myFont);
                                                    back.setBounds(400, 800, 200, 70);
                                                    back.setBackground(new Color(0x058CA2));
                                                    back.addActionListener(this);
                                                    panel1.add(back);


                                                    this.add(panel1);
                                                    this.setVisible(true);


                                                }

                                                public void actionPerformed(ActionEvent ae) {
                                                    String command = ae.getActionCommand();
                                                }

                                                static class revpat extends JFrame implements ActionListener {
                                                    private JTextField patID;
                                                    private JButton Removepat, back;
                                                    private JPanel panel1;
                                                    private Font myFont;
                                                    private JLabel patiD;

                                                    public RvmExPat() {
                                                        super("Remove Patient");
                                                        this.setSize(1000, 800);
                                                        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                                        this.setLayout(null);

                                                        myFont = new Font("Times new Roman", Font.PLAIN, 18);
                                                        panel1 = new JPanel();
                                                        panel1.setBounds(0, 0, 1000, 800);
                                                        panel1.setLayout(null);
                                                        panel1.setBackground(new Color(250, 237, 205));

                                                        patID = new JTextField("Enter Patient ID");
                                                        patID.setFont(myFont);
                                                        patID.setBounds(250, 100, 550, 50);
                                                        panel1.add(patID);

                                                        Removepat = new JButton("Remove Employee");
                                                        Removepat.setFont(myFont);
                                                        Removepat.setBounds(250, 300, 500, 60);
                                                        Removepat.setBackground(new Color(0x8CEEEB));
                                                        Removepat.addActionListener(this);
                                                        panel1.add(Removepat);

                                                        patiD = new JLabel("Enter Emp. ID");
                                                        patiD.setFont(myFont);
                                                        patiD.setBounds(250,  50, 200, 50);
                                                        panel1.add(patiD);

                                                        back = new JButton("Back");
                                                        back.setFont(myFont);
                                                        back.setBounds(350, 400, 300, 60);
                                                        back.setBackground(new Color(0x8CEEEB));
                                                        back.addActionListener(this);
                                                        panel1.add(back);

                                                        this.add(panel1);
                                                        this.setVisible(true);
                                                    }

                                                    static class revDoc extends JFrame implements ActionListener {
                                                        private JTextField DId;
                                                        private JButton Removedoc, back;
                                                        private JPanel panel1;
                                                        private Font myFont;
                                                        private JLabel did;

                                                        public RvmExDoc() {
                                                            super("Remove Doctor");
                                                            this.setSize(1000, 800);
                                                            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                                            this.setLayout(null);

                                                            myFont = new Font("Times new Roman", Font.PLAIN, 18);
                                                            panel1 = new JPanel();
                                                            panel1.setBounds(0, 0, 1000, 800);
                                                            panel1.setLayout(null);
                                                            panel1.setBackground(new Color(250, 237, 205));

                                                            DId = new JTextField("Enter Doctor ID");
                                                            DId.setFont(myFont);
                                                            DId.setBounds(250, 100, 550, 50);
                                                            panel1.add(DId);

                                                            Removedoc = new JButton("Remove Doctor");
                                                            Removedoc.setFont(myFont);
                                                            Removedoc.setBounds(250, 300, 500, 60);
                                                            Removedoc.setBackground(new Color(0x8CEEEB));
                                                            Removedoc.addActionListener(this);
                                                            panel1.add(Removedoc);

                                                            did = new JLabel("Enter Emp. ID");
                                                            did.setFont(myFont);
                                                            did.setBounds(250,  50, 200, 50);
                                                            panel1.add(did);

                                                            back = new JButton("Back");
                                                            back.setFont(myFont);
                                                            back.setBounds(350, 400, 300, 60);
                                                            back.setBackground(new Color(0x8CEEEB));
                                                            back.addActionListener(this);
                                                            panel1.add(back);

                                                            this.add(panel1);
                                                            this.setVisible(true);
                                                        }

                                                        public void actionPerformed(ActionEvent ae) {
                                                            String command = ae.getActionCommand();
                                                        }

                                                        static class revEmgpat extends JFrame implements ActionListener {
                                                            private JTextField EmPatID;
                                                            private JButton RemovEmPat, back;
                                                            private JPanel panel1;
                                                            private Font myFont;
                                                            private JLabel empatid;

                                                            public RvmEmgPat() {
                                                                super("Remove Emergency Patient");
                                                                this.setSize(1000, 800);
                                                                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                                                this.setLayout(null);

                                                                myFont = new Font("Times new Roman", Font.PLAIN, 18);
                                                                panel1 = new JPanel();
                                                                panel1.setBounds(0, 0, 1000, 800);
                                                                panel1.setLayout(null);
                                                                panel1.setBackground(new Color(250, 237, 205));

                                                                EmPatID = new JTextField("Enter Emergency Patient's ID");
                                                                EmPatID.setFont(myFont);
                                                                EmPatID.setBounds(250, 100, 550, 50);
                                                                panel1.add(EmPatID);

                                                                RemovEmPat = new JButton("Remove Doctor");
                                                                RemovEmPat.setFont(myFont);
                                                                RemovEmPat.setBounds(250, 300, 500, 60);
                                                                RemovEmPat.setBackground(new Color(0x8CEEEB));
                                                                RemovEmPat.addActionListener(this);
                                                                panel1.add(RemovEmPat);

                                                                empatid = new JLabel("Enter Emergency Patient's ID");
                                                                empatid.setFont(myFont);
                                                                empatid.setBounds(250,  50, 200, 50);
                                                                panel1.add(empatid);

                                                                back = new JButton("Back");
                                                                back.setFont(myFont);
                                                                back.setBounds(350, 400, 300, 60);
                                                                back.setBackground(new Color(0x8CEEEB));
                                                                back.addActionListener(this);
                                                                panel1.add(back);

                                                                this.add(panel1);
                                                                this.setVisible(true);
                                                            }

                                                            public void actionPerformed(ActionEvent ae) {
                                                                String command = ae.getActionCommand();
                                                            }

                                                            static class revStaff extends JFrame implements ActionListener {
                                                                private JTextField staff_ID;
                                                                private JButton RemovStaff, back;
                                                                private JPanel panel1;
                                                                private Font myFont;
                                                                private JLabel staff_id;

                                                                public RvmStaff() {
                                                                    super("Remove Staff");
                                                                    this.setSize(1000, 800);
                                                                    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                                                    this.setLayout(null);

                                                                    myFont = new Font("Times new Roman", Font.PLAIN, 18);
                                                                    panel1 = new JPanel();
                                                                    panel1.setBounds(0, 0, 1000, 800);
                                                                    panel1.setLayout(null);
                                                                    panel1.setBackground(new Color(250, 237, 205));

                                                                    staff_ID = new JTextField("Enter Staff ID");
                                                                    staff_ID.setFont(myFont);
                                                                    staff_ID.setBounds(250, 100, 550, 50);
                                                                    panel1.add(staff_ID);

                                                                    RemovStaff = new JButton("Remove Staff");
                                                                    RemovStaff.setFont(myFont);
                                                                    RemovStaff.setBounds(250, 300, 500, 60);
                                                                    RemovStaff.setBackground(new Color(0x8CEEEB));
                                                                    RemovStaff.addActionListener(this);
                                                                    panel1.add(RemovStaff);

                                                                    staff_id = new JLabel("Enter Staff ID");
                                                                    staff_id.setFont(myFont);
                                                                    staff_id.setBounds(250,  50, 200, 50);
                                                                    panel1.add(staff_id);

                                                                    back = new JButton("Back");
                                                                    back.setFont(myFont);
                                                                    back.setBounds(350, 400, 300, 60);
                                                                    back.setBackground(new Color(0x8CEEEB));
                                                                    back.addActionListener(this);
                                                                    panel1.add(back);

                                                                    this.add(panel1);
                                                                    this.setVisible(true);
                                                                }

                                                                public void actionPerformed(ActionEvent ae) {
                                                                    String command = ae.getActionCommand();
                                                                }
                                                                static class revAmbu extends JFrame implements ActionListener {
                                                                    private JTextField Ambulance_Num;
                                                                    private JButton RemoveAmbu, back;
                                                                    private JPanel panel1;
                                                                    private Font myFont;
                                                                    private JLabel ambulance_num;

                                                                    public RvmEmp() {
                                                                        super("Remove Ambulance");
                                                                        this.setSize(1000, 800);
                                                                        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                                                        this.setLayout(null);

                                                                        myFont = new Font("Times new Roman", Font.PLAIN, 18);
                                                                        panel1 = new JPanel();
                                                                        panel1.setBounds(0, 0, 1000, 800);
                                                                        panel1.setLayout(null);
                                                                        panel1.setBackground(new Color(250, 237, 205));

                                                                        Ambulance_Num = new JTextField("");
                                                                        Ambulance_Num.setFont(myFont);
                                                                        Ambulance_Num.setBounds(250, 100, 550, 50);
                                                                        panel1.add(Ambulance_Num);

                                                                        RemoveAmbu = new JButton("Remove Ambulance");
                                                                        RemoveAmbu.setFont(myFont);
                                                                        RemoveAmbu.setBounds(250, 300, 500, 60);
                                                                        RemoveAmbu.setBackground(new Color(0x8CEEEB));
                                                                        RemoveAmbu.addActionListener(this);
                                                                        panel1.add(RemoveAmbu);

                                                                        ambulance_num = new JLabel("Enter Ambulance Number");
                                                                        ambulance_num.setFont(myFont);
                                                                        ambulance_num.setBounds(250,  50, 200, 50);
                                                                        panel1.add(ambulance_num);

                                                                        back = new JButton("Back");
                                                                        back.setFont(myFont);
                                                                        back.setBounds(350, 400, 300, 60);
                                                                        back.setBackground(new Color(0x8CEEEB));
                                                                        back.addActionListener(this);
                                                                        panel1.add(back);

                                                                        this.add(panel1);
                                                                        this.setVisible(true);
                                                                    }

                                                                    public void actionPerformed(ActionEvent ae) {
                                                                        String command = ae.getActionCommand();
                                                                    }

