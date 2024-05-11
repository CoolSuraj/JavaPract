--website for challenge

--https://mystery.knightlab.com/#experienced

--part 1:

select * from crime_scene_report where city = 'SQL City'
and date = '20180115' and type = 'murder';


select id from person where address_street_name = 'Northwestern Dr' order by address_number desc limit 1;
select id from person where address_street_name = 'Franklin Ave' and name like '%Annabel%'   ;
--Security footage shows that there were 2 witnesses. 
--The first witness lives at the last house on "Northwestern Dr". 
--The second witness, named Annabel, lives somewhere on "Franklin Ave".
--select * from facebook_event_checkin where person_id = (select id from person where address_street_name = 'Northwestern Dr' order by address_number desc limit 1 );
--14887	4719	The Funky Grooves Tour	20180115          
--select * from person where address_street_name = 'Franklin Ave' and name like '%Annabel%'   ;              
--16371	Annabel Miller	490173	103	Franklin Ave	318771143
--select * from facebook_event_checkin where person_id = 16371;
--16371	4719	The Funky Grooves Tour	20180115
select * from get_fit_now_member where person_id in (16371,14887)
--90081	16371	Annabel Miller	20160208	gold


select * from interview where person_id in (16371,14887)


select name from person where id in(select person_id from get_fit_now_member where id in (
select membership_id from get_fit_now_check_in where check_in_date = 20180109 
and membership_id in (select  id from get_fit_now_member where  membership_status = 'gold' )
and check_out_time >= (select check_in_time from get_fit_now_check_in where membership_id = 90081)));

--part 2 

select p.annual_income,p.ssn from income p where p.ssn in (
select distinct a.ssn  from person a , drivers_license b
where 1=1
and a.license_id =b.id
and b.height between 65 and 67  
and b.hair_color = 'red' and b.car_model='Model S' 
and b.gender = 'female')
order by annual_income desc limit 1
;

--961388910
--337169072
--987756388
select name from person where ssn in (
select i.ssn from income i where i.ssn = 987756388);

              
