var Tshirt = /** @class */ (function () {
    function Tshirt(c, m, d, s) {
        this.color = c;
        this.material = m;
        this.design = d;
        this.size = s;
    }
    Tshirt.prototype.display = function () {
        console.log(this.color + " " + this.material + " " + this.design + " " + this.size);
    };
    return Tshirt;
}());
var t1 = new Tshirt('pink', 'silk', 'solid', 'xxl');
var t2 = new Tshirt('black', 'cotton', 'printed', 'xxl');
var t3 = new Tshirt('blue', 'leather', 'stripes', 'm');
t1.display();
t2.display();
t3.display();
