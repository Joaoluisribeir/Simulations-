class Npc{
  constructor(name,age,profession){
    this.name = name;
    this.age = age;
    this.profession = profession;
  }
  topresent(name){
    name = this.name;
    console.log(`hi my name is ${name}`);
  }
  }

class Play extends Npc{
  constructor(name, age,profession,level){
    super(name,age,profession);
    this.level = level;
  }
}


let any = new Npc('any', 22, 'farmer');
let leo = new Npc('leo', 25, 'gate guard');
let misa = new Npc('misa', 20, 'adventurous');

let play = new Play('jonh', 20, 'warrior', 10);
console.log(play);
any.topresent()
leo.topresent();
misa.topresent();
