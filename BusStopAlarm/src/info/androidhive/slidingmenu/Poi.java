package info.androidhive.slidingmenu;

//�������Oclass�A�W�٬�Poi
public class Poi 
{
     private String Name;        //���I���a�W��
     private double Latitude;    //���I���a�n��
     private double Longitude;   //���I���a�g��
     private double Distance;    //���I���a�Z��

     //�إߪ���ɻݱa�J���I���a�W�١B���I���a�n�סB���I���a�g��
     public Poi(String name , double latitude , double longitude)
     {
       //�N��T�a�J���O�ݩ�
        Name = name ;
        Latitude = latitude ;
        Longitude = longitude ;
     }
     
    //���o���a�W��
     public String getName() 
     {
        return Name;
     }

    //���o���a�n��
     public double getLatitude()
     {
        return Latitude;
     }

    //���o���a�g��
     public double getLongitude()
     {
        return Longitude;
     }

    //�g�J���a�Z��
     public void setDistance(double distance)
     {
        Distance = distance;
     }
     
    //�������a�Z��
     public double getDistance()
     {
        return Distance;
     }
}