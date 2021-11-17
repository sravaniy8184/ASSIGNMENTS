var Student = /** @class */ (function () {
    function Student(sid, sname, sclass) {
        this.sid = sid;
        this.sname = sname;
        this.sclass = sclass;
        this.stdId = sid;
        this.stdName = sname;
        this.stdClass = sclass;
    }
    Student.prototype.display = function () {
        console.log(this.stdId + " " + this.stdName + " " + this.stdClass);
    };
    return Student;
}());
var student1 = new Student(234, 'sravani', 'CSE');
var student2 = new Student(108, 'Shiva', 'CSE');
student1.display();
student2.display();
